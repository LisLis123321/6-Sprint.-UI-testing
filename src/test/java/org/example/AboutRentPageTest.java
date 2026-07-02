package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;


class AboutRentPageTest extends BaseTest {

    AboutRentPage aboutRentPage;
    OrderScooterPage orderScooterPage;
    MainQuestionsPage mainQuestionsPage;


    @BeforeEach
    void initPage() {
        orderScooterPage = new OrderScooterPage(driver, wait);
        mainQuestionsPage = new MainQuestionsPage(driver, wait);
        aboutRentPage = new AboutRentPage(driver, wait);
        fillFirstForm();
    }


    void fillFirstForm() {
        orderScooterPage.clickOnElement(mainQuestionsPage.getHighOrderButton());
        orderScooterPage.fillOrderForm(
                "Иван",
                "Иванов",
                "г. Москва, ул. Тверская, д. 1",
                "Бульвар Рокоссовского",
                "+79991234567"
        );
        orderScooterPage.clickOnElement(orderScooterPage.getForwardButton());
        wait.until(ExpectedConditions.visibilityOf(aboutRentPage.getWhenToBringTheScooterField()));

    }

    @Test
    void fillFieldsAboutRentForm() {
        orderScooterPage.clickOnElement(aboutRentPage.getWhenToBringTheScooterField());
        orderScooterPage.clickOnElement(aboutRentPage.getDataDeliveryButton());
        orderScooterPage.clickOnElement(aboutRentPage.getRentalPeriodField());
        orderScooterPage.clickOnElement(aboutRentPage.getOneDayField());
        orderScooterPage.clickOnElement(aboutRentPage.getScooterColorField());
        orderScooterPage.fillField(aboutRentPage.getCommentToCourierField(), "Позвоните перед доставкой");
        orderScooterPage.clickOnElement(aboutRentPage.getOrderButton());
        wait.until(ExpectedConditions.visibilityOf(aboutRentPage.getYouWantToPlaceAnOrderYesButton()));
        orderScooterPage.clickByJavaScript(aboutRentPage.getYouWantToPlaceAnOrderYesButton());
        wait.until(ExpectedConditions.visibilityOf(aboutRentPage.getTheOrderHasBeenPlacedPage()));

        Assertions.assertTrue(aboutRentPage.getTheOrderHasBeenPlacedPage().isDisplayed());
    }
}