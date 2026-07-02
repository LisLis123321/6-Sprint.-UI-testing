package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OrderScooterPage extends BasePage {

    //Имя
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement nameField;

    //Фамилия
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement surNameField;

    //Адрес:куда привезти заказ
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement addressField;

    //Станция метро
    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private WebElement metroStationField;

    //Телефон: на него позвонит курьер
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement telephoneField;

    //Кнопка Далее
    @FindBy(css = ".Button_Button__ra12g.Button_Middle__1CSJM")
    private WebElement forwardButton;

    // локатор списка элементов для заполнения
    @FindBy(xpath =
            "//div[contains(text(), 'Введите корректное имя') or " +
                    "contains(text(), 'Введите корректную фамилию') or " +
                    "contains(text(), 'Введите корректный адрес') or " +
                    "contains(text(), 'Выберите станцию') or " +
                    "contains(text(), 'Введите корректный номер')]")
    private List<WebElement> validateErrors;


    public OrderScooterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillField(WebElement element, String value) {
        scrollToElement(element);
        element.clear();
        if (value != null && !value.trim().isEmpty()) {
            element.sendKeys(value);
        }
    }

    public void fillOrderForm(String name, String surname, String address, String metro, String telephone) {
        fillField(nameField, name);
        fillField(surNameField, surname);
        fillField(addressField, address);
        fillField(metroStationField, metro);
        metroStationField.sendKeys(Keys.ARROW_DOWN);
        metroStationField.sendKeys(Keys.ENTER);
        fillField(telephoneField, telephone);
    }


    public boolean hasAnyValidatorMessage(String... expectedTexts) {
        List<WebElement> errors = driver.findElements(
                By.xpath("//div[contains(text(), 'Введите корректное имя') or " +
                        "contains(text(), 'Введите корректную фамилию') or " +
                        "contains(text(), 'Введите корректный адрес') or " +
                        "contains(text(), 'Выберите станцию') or " +
                        "contains(text(), 'Введите корректный номер')]"));

        for (WebElement error : errors) {
            String errorText = error.getText().toLowerCase();

            for (String expectedText : expectedTexts) {
                if (errorText.contains(expectedText.toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }


    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getSurNameField() {
        return surNameField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getMetroStationField() {
        return metroStationField;
    }

    public WebElement getTelephoneField() {
        return telephoneField;
    }

    public WebElement getForwardButton() {
        return forwardButton;
    }
}
