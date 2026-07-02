package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MainQuestionsPageTest extends BaseTest {

    MainQuestionsPage mainQuestionsPage;

    @BeforeEach
    void initPage() {
        mainQuestionsPage = new MainQuestionsPage(driver, wait);
    }

    @Test
    void checkTextHowMuchItCostsAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getHowMuchItCostsAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getHowMuchItCostsAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextHowMuchItCostsAccordion());
        Assertions.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);
    }

    @Test
    void checkTextMultipleScootersAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getWantMultipleScootersAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getWantMultipleScootersAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextWantMultipleScootersAccordion());
        Assertions.assertEquals("Пока что у нас так: один заказ — один самокат." +
                " Если хотите покататься с друзьями, можете просто сделать несколько" +
                " заказов — один за другим.", actual);
    }


    @Test
    void checkTextCalculateTheRentalTimeAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getCalculateTheRentalTimeAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getCalculateTheRentalTimeAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextCalculateTheRentalTimeAccordion());
        Assertions.assertEquals("Допустим, вы оформляете заказ на " +
                "8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени " +
                "аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы " +
                "привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);
    }

    @Test
    void checkTextOrderScooterTodayAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getOrderScooterTodayAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getOrderScooterTodayAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextOrderScooterTodayAccordion());
        Assertions.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);
    }

    @Test
    void checkTextExtendTheOrderOrReturnTheScooterAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getExtendTheOrderOrReturnTheScooterAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getExtendTheOrderOrReturnTheScooterAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextExtendTheOrderOrReturnTheScooterAccordion());
        Assertions.assertEquals("Пока что нет! Но если что-то срочное — всегда можно " +
                "позвонить в поддержку по красивому номеру 1010.", actual);
    }

    @Test
    void checkTextBringTheChargerAlongWithTheScooterAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getBringTheChargerAlongWithTheScooterAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getBringTheChargerAlongWithTheScooterAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextBringTheChargerAlongWithTheScooterAccordion());
        Assertions.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает " +
                "на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);
    }

    @Test
    void checkTextCancelOrderAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getCancelOrderAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getCancelOrderAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextCancelOrderAccordion());
        Assertions.assertEquals("Да, пока самокат не привезли. Штрафа не будет, " +
                "объяснительной записки тоже не попросим. Все же свои.", actual);
    }

    @Test
    void checkTextLiveAcrossTheMoscowRingRoadAccordion() {
        mainQuestionsPage.scrollToElement(mainQuestionsPage.getLiveAcrossTheMoscowRingRoadAccordion());
        mainQuestionsPage.clickOnElement(mainQuestionsPage.getLiveAcrossTheMoscowRingRoadAccordion());
        String actual = mainQuestionsPage.getText(mainQuestionsPage.getTextLiveAcrossTheMoscowRingRoadAccordion());
        Assertions.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actual);
    }
}