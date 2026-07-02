package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class OrderScooterPageTest extends BaseTest {

    OrderScooterPage orderScooterPage;
    MainQuestionsPage mainQuestionsPage;


    @BeforeEach
    void initPage() {
        orderScooterPage = new OrderScooterPage(driver, wait);
        mainQuestionsPage = new MainQuestionsPage(driver, wait);

    }

    @ParameterizedTest
    @CsvFileSource(
            resources = "/orderDoc.csv",
            numLinesToSkip = 1,
            delimiter = ','
    )
    void fillFieldsOfOrderForm(String name, String surname, String address, String metro, String telephone, String expectedResult) {
        orderScooterPage.clickOnElement(mainQuestionsPage.getHighOrderButton());
        orderScooterPage.fillOrderForm(name, surname, address, metro, telephone);
        orderScooterPage.clickOnElement(orderScooterPage.getForwardButton());

        switch (expectedResult) {
            case "success":
                Assertions.assertFalse(orderScooterPage.hasAnyValidatorMessage(),
                        "При валидных данных ошибок быть не должно");
                break;

            case "error":
                Assertions.assertTrue(orderScooterPage.hasAnyValidatorMessage("коррект", "выберите"),
                        "При невалидных данных должна появиться ошибка с 'коррект' или 'Выберите'");
                break;
        }
    }
}