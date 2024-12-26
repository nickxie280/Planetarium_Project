package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage {
    private WebDriver driver;

    @FindBy(id = "greeting")
    private WebElement greetingHeader;

    @FindBy(tagName = "tr")
    private List<WebElement> tableRows;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(id = "usernameInput")
    private WebElement userInput;

    @FindBy(id = "passwordInput")
    private WebElement passInput;

    public Homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPageForHomepage(){
        driver.get("http://localhost:8080/");
    }

    public void goDirectlyToHomepage() {
        driver.get("http://localhost:8080/planetarium");
    }

    public void knownGoodLogin(){
        userInput.sendKeys("Batman");
        passInput.sendKeys("Iamthenight1939");
        loginButton.click();
    }

    public String getHomePageGreeting(){
        return greetingHeader.getText();
    }

    public int getNumberOfCelestialRows(){
        return tableRows.size()-1;
    }

}
