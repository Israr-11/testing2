package Pages;

import basePages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ProductDetailsObj;

public class ProductDetailsPage extends BasePage {

    WebDriver driver;

    // WebElement representing the 'Product Details' link under the 'Pages' menu
    @FindBy(xpath = ProductDetailsObj.BUTTON_ADD_TO_CART_XPATH)
    WebElement buttonAddToCartElement;

    // WebElement representing the 'Cart' link
    @FindBy(xpath = ProductDetailsObj.LINK_CART_XPATH)
    WebElement linkCartElement;

    // WebElement representing the 'Check Out' link
    @FindBy(xpath = ProductDetailsObj.LINK_CHECK_OUT_XPATH)
    WebElement linkCheckOutElement;

    // Constructor for ProductDetailsPage class
    public ProductDetailsPage(WebDriver driver) {
        // Call to the constructor of the BasePage class passing WebDriver instance
        super(driver);
        // Assigning the WebDriver instance passed as parameter to the local driver variable
        this.driver = driver;
        // Initializing elements using PageFactory to enable Page Object Model
        PageFactory.initElements(driver, this);
    }

    // Method to click the 'Add to Cart' button
    public void clickAddToCart() {
        buttonAddToCartElement.click();
    }

    // Method to click the 'Cart' link
    public void clickCart() {
        linkCartElement.click();
    }

    // Method to click the 'Check Out' link
    public void clickCheckOut(){
        // Call to explicit wait method from the BasePage class to wait for visibility of 'Check Out' link
        super.explicitWaitForVisibility(linkCheckOutElement);
        // Click on the 'Check Out' link
        linkCheckOutElement.click();
    }
}