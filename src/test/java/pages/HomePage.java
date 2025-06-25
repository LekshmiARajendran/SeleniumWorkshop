package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText();
    //creating a Constructor for the class
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //dropdown page
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    //generic way to return all the links
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    //Hover menu
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

}
