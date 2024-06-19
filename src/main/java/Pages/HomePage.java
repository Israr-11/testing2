package Pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePageObj;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;

    // WebElement representing the 'Pages' menu item
    @FindBy(xpath = HomePageObj.PAGES_MENU_ITEM_XPATH)
    WebElement menuPagesElement;

    // WebElement representing the 'Contact' link under the 'Pages' menu
    @FindBy(xpath = HomePageObj.LINK_PAGE_MENU_CONTACT_XPATH)
    WebElement linkPageMenuContactElement;

    // WebElement representing the 'Product Details' link under the 'Pages' menu
    @FindBy(xpath = HomePageObj.LINK_PAGE_MENU_PRODUCT_DETAILS_XPATH)
    WebElement linkPageMenuProductDetailsElement;

    // Constructor for HomePage class
    public HomePage(WebDriver driver) {
        // Assigning the WebDriver instance passed as parameter to the local driver variable
        this.driver = driver;
        // Initializing elements using PageFactory to enable Page Object Model
        PageFactory.initElements(driver, this);
    }

    // Method to click on the 'Contact' link under the 'Pages' menu
    public void clickPageMenuContact() {
        linkPageMenuContactElement.click();
        if (isAlertPresent()) {
            driver.switchTo().alert().accept();
        } else {
            System.out.println("No alert present after clicking on Contact.");
        }

}

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    // Method to click on the 'Product Details' link under the 'Pages' menu
    public void clickPageMenuProductDetails() {
        linkPageMenuProductDetailsElement.click();
    }

    // Method to perform mouse hover action on the 'Pages' menu item
    public void mousehoverOnPagesMenu() {
        // Creating an Actions object for performing advanced user interactions
        Actions action = new Actions(driver);
        // Moving the mouse pointer to the 'Pages' menu item
        action.moveToElement(menuPagesElement).build().perform();
    }

    //Method to assert page title
    public void assertPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected");
    }
}


