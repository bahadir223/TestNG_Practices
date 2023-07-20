package grupcalismalarimiz.pages;

import grupcalismalarimiz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BlueRentAlCarsPage {

    public BlueRentAlCarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement girisYapildiVerify;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement mesajVerify;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOut;


    @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")  // --> logOut'a tiklayinca önümüze çıkan " OK "
    public WebElement ok;

    @FindBy(xpath = "//div[@class='invalid-feedback']")  // --> logOut'a tiklayinca önümüze çıkan " OK "
    public WebElement mailMustBeValid;

    @FindBy(xpath = "//select[@name='car']")  // --> logOut'a tiklayinca önümüze çıkan " OK "
    public WebElement ddm;

    @FindBy(xpath = "//*[@type='submit']")  // --> logOut'a tiklayinca önümüze çıkan " OK "
    public WebElement continueReservation;





}
