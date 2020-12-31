package view;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestResultPage extends Page{

    @FindBy(id="date")
    private WebElement dateField;

    @FindBy(id="submit")
    private WebElement submitButton;

    public TestResultPage(WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"?command=RegisterTestResult");
    }
    public void setDate(String date){
        dateField.clear();
        dateField.sendKeys(date);
    }

}
