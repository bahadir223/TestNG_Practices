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

    @FindBy(xpath = "//div[@id='cart']")
    public WebElement sepetimClick;

    @FindBy(xpath = "(//td/a)[1]")
    public WebElement sepettekiUrun;

    @FindBy(xpath = "(//td/a)[2]")
    public WebElement sepettekiIkinciUrun;


    @FindBy(xpath = "//*[@class='ellipsis'] ")
    public List<WebElement> sepetimdekiUrunler;

    @FindBy(xpath = "(//*[@class='name'])[3]")
    public WebElement aramaSonucuIlkUrun;

    @FindBy(xpath = "//a[@id='js-cart']")
    public WebElement sepeteGit;

    @FindBy(xpath = "(//input[@name='quantity'])[2]")
    public WebElement ilkUrunMiktar;

    @FindBy(xpath = "(//input[@name='quantity'])[1]")
    public WebElement ikinciUrunMiktar;

    @FindBy(xpath = "//a[@class='button']")
    public WebElement alisVeriseDevamEt;

    @FindBy(xpath = "//input[@id='select-all-cart']")
    public WebElement kontrolKutulari;

    @FindBy(xpath = "//a[@id='cart-selected-button']")
    public WebElement kutularinSeciliOldugunuDogrulama;

    @FindBy(xpath = "(//input[@class='cart-select'])[1]")
    public WebElement ikinciUrunKontrolKutusu;

    @FindBy(xpath = "//a[@id='cart-selected-button']")
    public WebElement secilenleriDahaSonraAl;

    @FindBy(xpath = "(//*[@class='vertical-pr-link'])[1]")
    public WebElement enCokSatilanIlkUrun;

    @FindBy(xpath = "(//*[@class='readmore-js-toggle'])[1]")
    public WebElement devaminiOku;

    @FindBy(css = "[id='button-cart']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//*[@type='text'])[2]")   //sepetime gittikten sonra ürünün miktarının locate'i
    public WebElement sepetimdekiMiktar;

    @FindBy(xpath = "(//*[@class='ribbon-container'])[1]")
    public WebElement haftaninYayinevi;

    @FindBy(xpath = "(//*[@class='ribbon-container'])[3]")
    public WebElement ayinYayinevi;

    @FindBy(xpath = "(//*[@class='ribbon-container'])[15]")
    public WebElement enCokSatilanlar;

    @FindBy(xpath = "//*[@class='menu-top-button login']")
    public WebElement girisYap;


}
