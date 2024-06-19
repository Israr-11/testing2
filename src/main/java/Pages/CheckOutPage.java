package Pages;

import basePages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CheckOutPageObj;
import org.openqa.selenium.JavascriptExecutor;

public class CheckOutPage extends BasePage {

    WebDriver driver;

    // WebElement declarations using @FindBy annotation

    // Input field for first name
    @FindBy(xpath = CheckOutPageObj.INPUT_FIRST_NAME_XPATH)
    WebElement inputFirstNameElement;

    // Input field for last name
    @FindBy(xpath = CheckOutPageObj.INPUT_LAST_NAME_XPATH)
    WebElement inputLastNameElement;

    // Dropdown to select country
    @FindBy(xpath = CheckOutPageObj.SELECT_COUNTRY_XPATH)
    WebElement selectCountryElement;

    // Input field for street address
    @FindBy(xpath = CheckOutPageObj.INPUT_STREET_ADDRESS_XPATH)
    WebElement inputStreetAddressElement;

    // Input field for postal code
    @FindBy(xpath = CheckOutPageObj.INPUT_POSTAL_CODE_XPATH)
    WebElement inputPostalCodeElement;

    // Input field for town or city
    @FindBy(xpath = CheckOutPageObj.INPUT_TOWN_CITY_XPATH)
    WebElement inputTownCityElement;

    // Input field for province
    @FindBy(xpath = CheckOutPageObj.INPUT_PROVINCE_XPATH)
    WebElement inputProvinceElement;

    // Input field for phone number
    @FindBy(xpath = CheckOutPageObj.INPUT_PHONE_NUMBER_XPATH)
    WebElement inputPhoneNumberElement;

    // Input field for email address
    @FindBy(xpath = CheckOutPageObj.INPUT_EMAIL_ADDRESS_XPATH)
    WebElement inputEmailAddressElement;

    // Checkbox to agree to terms and conditions
    @FindBy(xpath = CheckOutPageObj.CHK_TERMS_AND_CONDITION_XPATH)
    WebElement chkTermsAndCondition;

    // Link to select cash on delivery payment option
    @FindBy(xpath = CheckOutPageObj.LINK_CASH_ON_DELIEVERY_XPATH)
    WebElement linkCashOnDelievery;

    // Link to place the order
    @FindBy(xpath = CheckOutPageObj.LINK_PLACE_ORDER_XPATH)
    WebElement linkPlaceOrder;

    // Constructor for the CheckOutPage class
    public CheckOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with different elements on the checkout page

    // Method to enter first name
    public void enterFirstName(String firstname) {
        inputFirstNameElement.sendKeys(firstname);
    }

    // Method to enter last name
    public void enterLastName(String lastname) {
        inputLastNameElement.sendKeys(lastname);
    }

    // Method to select country name from dropdown
    public void selectCountryName(String country) {
        Select select = new Select(selectCountryElement);
        select.selectByVisibleText(country);
    }

    // Method to enter street address
    public void enterStreetAddress(String streetAddress) {
        inputStreetAddressElement.sendKeys(streetAddress);
    }

    // Method to enter postal code
    public void enterPostalCode(String postalCode) {
        inputPostalCodeElement.sendKeys(postalCode);
    }

    // Method to enter town or city
    public void enterTownCity(String city) {
        inputTownCityElement.sendKeys(city);
    }

    // Method to enter province
    public void enterProvince(String state) {
        inputProvinceElement.sendKeys(state);
    }

    // Method to enter phone number
    public void enterPhoneNumber(String phoneNumber) {
        inputPhoneNumberElement.sendKeys(phoneNumber);
    }

    // Method to enter email address
    public void enterEmailAddress(String email) {
        inputEmailAddressElement.sendKeys(email);
    }

    // Method to check terms and conditions checkbox
    public void checkTermsAndConditions() {
        chkTermsAndCondition.click();
    }

    // Method to click on Cash On Delivery link
    public void clickCashOnDelievery() {
        linkCashOnDelievery.click();
    }

    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    // Method to click on Place Order link
    public void clickPlaceOrder() {
        linkPlaceOrder.click();
    }
}
