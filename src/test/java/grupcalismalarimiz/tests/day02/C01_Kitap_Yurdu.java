package grupcalismalarimiz.tests.day02;

import grupcalismalarimiz.pages.KitapYurduPages;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Kitap_Yurdu {

    @Test
    public void test01() {
        //    https://www.kitapyurdu.com/ adresine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("kitapYurduUrl"));
        String anasayfaBasligi = Driver.getDriver().getTitle();
        //    "En Çok Satılanlar" bölümündeki ilk ürünü seçiniz.
        KitapYurduPages kitapYurduPages = new KitapYurduPages();
        kitapYurduPages.enCokSatilanIlkUrun.click();
        //    Seçilen ürüne ait sayfanın açıldığını doğrulayınız.
        String ikinciSayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertNotEquals(anasayfaBasligi, ikinciSayfaBasligi);
        //     "Devamını Oku…" butonuna basınız.
        kitapYurduPages.devaminiOku.click();
        //    Ürünü sepete ekleyiniz.
        kitapYurduPages.sepeteEkle.click();
        //    Sepete gidiniz.
        kitapYurduPages.sepetimClick.click();
        kitapYurduPages.sepeteGit.click();
        //    Ürüne ait kontrol kutusunu işaretleyiniz.
        kitapYurduPages.kontrolKutulari.click();
        //    Ürün miktarını değiştiriniz.
        kitapYurduPages.sepetimdekiMiktar.clear();
        kitapYurduPages.sepetimdekiMiktar.sendKeys(ConfigReader.getProperty("sepetimMiktar"));
    }
}
