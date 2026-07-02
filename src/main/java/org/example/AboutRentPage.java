package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRentPage extends BasePage {

    // Когда привезти самокат
    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement whenToBringTheScooterField;

    // Срок аренды
    @FindBy(className = "Dropdown-placeholder")
    private WebElement rentalPeriodField;

    //локатор выбора 'сутки'
    @FindBy(xpath = ".//div[text()='сутки']")
    private WebElement oneDayField;

    //Цвет самоката 'черный жемчуг'
    @FindBy(xpath = ".//input[@id='black']")
    private WebElement scooterColorField;

    //комментарий для курьера
    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private WebElement commentToCourierField;

    //Заказать
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']")
    private WebElement orderButton;

    //число в календаре поля Срока аренды
    @FindBy(xpath = ".//div[@aria-label='Choose четверг, 2-е июля 2026 г.']")
    private WebElement DataDeliveryButton;

    //кнопка Да на форме подтверждения
    @FindBy(xpath = ".//button[contains(@class, 'Button_Button__ra12g') and text()='Да']")
    private WebElement YouWantToPlaceAnOrderYesButton;

    //Форма Заказ оформлен
    @FindBy(xpath = "//div[contains(@class, 'Order_ModalHeader')]")
    private WebElement theOrderHasBeenPlacedPage;

    public AboutRentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getRentalPeriodField() {
        return rentalPeriodField;
    }

    public WebElement getWhenToBringTheScooterField() {
        return whenToBringTheScooterField;
    }

    public WebElement getOneDayField() {
        return oneDayField;
    }

    public WebElement getScooterColorField() {
        return scooterColorField;
    }

    public WebElement getCommentToCourierField() {
        return commentToCourierField;
    }

    public WebElement getOrderButton() {
        return orderButton;
    }

    public WebElement getDataDeliveryButton() {
        return DataDeliveryButton;
    }

    public WebElement getYouWantToPlaceAnOrderYesButton() {
        return YouWantToPlaceAnOrderYesButton;
    }

    public WebElement getTheOrderHasBeenPlacedPage() {
        return theOrderHasBeenPlacedPage;
    }
}
