package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");


    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }
    //Select any of the option from the dropdown not the first or second
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    //collect all the available drop down options to a List

    public List<String> getSelectedOptions(){
       List<WebElement> selectedElements =  findDropDownElement().getAllSelectedOptions();
       return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
