package grupcalismalarimiz.pages;

import grupcalismalarimiz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KitapYurduPages {

    public KitapYurduPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//a[@class='add-to-cart'])[2]")
    public WebElement birinciUrunSepeteEkle;

    @FindBy(xpath = "(//a[@class='add-to-cart'])[3]")
    public WebElement ikinciUrunSepeteEkle;

    @FindBy(xpath = "(//*[@class='common-sprite'])[7]")
    public WebElement sepetim;

    @FindBy(xpath = "(//td/a)[2]")
    public WebElement ilkEklenen;

    @FindBy(xpath = "(//td/a)[1]")
    public WebElement enSonEklenen;

    @FindBy(xpath = "//*[@class='ellipsis'] ")
    public List<WebElement> sepetimdekiUrunler;

    @FindBy(xpath = "(//*[@class='name'])[3]")
    public WebElement aramaSonucuIlkUrun;










}
