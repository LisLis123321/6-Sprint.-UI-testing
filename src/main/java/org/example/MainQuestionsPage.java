package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainQuestionsPage extends BasePage {

    //Сколько это стоит и как оплатить?
    @FindBy(id = "accordion__heading-0")
    private WebElement howMuchItCostsAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-0")
    private WebElement textHowMuchItCostsAccordion;

    //Хочу сразу несколько самокатов! Так можно?
    @FindBy(id = "accordion__heading-1")
    private WebElement wantMultipleScootersAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-1")
    private WebElement textWantMultipleScootersAccordion;

    //Как рассчитывается время аренды?
    @FindBy(id = "accordion__heading-2")
    private WebElement calculateTheRentalTimeAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-2")
    private WebElement textCalculateTheRentalTimeAccordion;

    //Можно ли заказать самокат прямо на сегодня?
    @FindBy(id = "accordion__heading-3")
    private WebElement orderScooterTodayAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-3")
    private WebElement textOrderScooterTodayAccordion;

    //Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(id = "accordion__heading-4")
    private WebElement extendTheOrderOrReturnTheScooterAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-4")
    private WebElement textExtendTheOrderOrReturnTheScooterAccordion;

    //Вы привозите зарядку вместе с самокатом?
    @FindBy(id = "accordion__heading-5")
    private WebElement bringTheChargerAlongWithTheScooterAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-5")
    private WebElement textBringTheChargerAlongWithTheScooterAccordion;

    //Можно ли отменить заказ?
    @FindBy(id = "accordion__heading-6")
    private WebElement cancelOrderAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-6")
    private WebElement textCancelOrderAccordion;

    //Я живу за МКАДом, привезете?
    @FindBy(id = "accordion__heading-7")
    private WebElement liveAcrossTheMoscowRingRoadAccordion;
    //Текст аккордеона
    @FindBy(id = "accordion__panel-7")
    private WebElement textLiveAcrossTheMoscowRingRoadAccordion;

    //Кнопка Заказать
    @FindBy(className = "Button_Button__ra12g")
    private WebElement highOrderButton;


    public MainQuestionsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }


    public WebElement getCalculateTheRentalTimeAccordion() {
        return calculateTheRentalTimeAccordion;
    }

    public WebElement getOrderScooterTodayAccordion() {
        return orderScooterTodayAccordion;
    }

    public WebElement getExtendTheOrderOrReturnTheScooterAccordion() {
        return extendTheOrderOrReturnTheScooterAccordion;
    }

    public WebElement getTextHowMuchItCostsAccordion() {
        return textHowMuchItCostsAccordion;
    }

    public WebElement getBringTheChargerAlongWithTheScooterAccordion() {
        return bringTheChargerAlongWithTheScooterAccordion;
    }

    public WebElement getCancelOrderAccordion() {
        return cancelOrderAccordion;
    }

    public WebElement getLiveAcrossTheMoscowRingRoadAccordion() {
        return liveAcrossTheMoscowRingRoadAccordion;
    }

    public WebElement getTextCalculateTheRentalTimeAccordion() {
        return textCalculateTheRentalTimeAccordion;
    }

    public WebElement getTextOrderScooterTodayAccordion() {
        return textOrderScooterTodayAccordion;
    }

    public WebElement getTextExtendTheOrderOrReturnTheScooterAccordion() {
        return textExtendTheOrderOrReturnTheScooterAccordion;
    }

    public WebElement getTextBringTheChargerAlongWithTheScooterAccordion() {
        return textBringTheChargerAlongWithTheScooterAccordion;
    }

    public WebElement getTextCancelOrderAccordion() {
        return textCancelOrderAccordion;
    }

    public WebElement getTextLiveAcrossTheMoscowRingRoadAccordion() {
        return textLiveAcrossTheMoscowRingRoadAccordion;
    }

    public WebElement getHowMuchItCostsAccordion() {
        return howMuchItCostsAccordion;
    }

    public WebElement getWantMultipleScootersAccordion() {
        return wantMultipleScootersAccordion;
    }

    public WebElement getTextWantMultipleScootersAccordion() {
        return textWantMultipleScootersAccordion;
    }

    public WebElement getHighOrderButton() {
        return highOrderButton;
    }

}
