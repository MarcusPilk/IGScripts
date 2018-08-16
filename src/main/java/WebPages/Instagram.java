package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Instagram {
    @FindBy (id="f1a60ecc4e96b24")
    WebElement email;

    @FindBy (id="fae496d2ca2fb4")
    WebElement name;

    @FindBy (id="f26bbb12e568c1")
    WebElement username;

    @FindBy (xpath ="//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[4]/div/div[2]/a/span")
    WebElement usernameCreate;

    @FindBy (id="f23117bdff5cb68")
    WebElement password;

    @FindBy (xpath = "//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[6]/span/button")
    WebElement signUpButton;

    @FindBy (id="igCoreRadioButtonageRadioabove_18")
    WebElement eighteenPlus;

    @FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div/button")
    WebElement nextButton;

    public void signUp(String emailAddress,String nameString, String passwordString){
        email.sendKeys(emailAddress);
        name.sendKeys(nameString);
        password.sendKeys(passwordString);
        username.sendKeys(emailAddress);
        usernameCreate.click();
        signUpButton.click();
        eighteenPlus.click();
        nextButton.click();
    }

}
