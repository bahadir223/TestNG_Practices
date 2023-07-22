package grupcalismalarimiz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import grupcalismalarimiz.utilities.Driver;

public class InstagramPage {
    public InstagramPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='_aacl _aaco _aacw _aad0 _aad7']")
    public WebElement kaydol;

    @FindBy(css = "[name=emailOrPhone]")
    public WebElement mail;

    @FindBy(css = "[type='submit']")
    public WebElement submit;

    @FindBy(css = "title='Ay:'")
    public WebElement ay;
}
