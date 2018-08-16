package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TenMinEmail {
    @FindBy (id = "mailAddress")
    WebElement emailAddress;

    @FindBy (id="ui-id-1")
    WebElement clickMail;

    @FindBy (xpath = "//*[@id=\"email_content\"]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/a")
    WebElement confirmEmail;


    public String getEmail(){
        return emailAddress.getAttribute("value").toString();
    }
}
