package grupcalismalarimiz.tests.day01;

import grupcalismalarimiz.pages.KitapYurduPages;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import grupcalismalarimiz.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class C01_Kitap_Yurdu {


    @Test
    public void test01() {
        // https://www.kitapyurdu.com/ adresine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("kitapYurduUrl"));
        // Arama motorunda "Java" kelimesini aratınız.
        KitapYurduPages kitapYurduPages = new KitapYurduPages();
        kitapYurduPages.aramaKutusu.sendKeys(ConfigReader.getProperty("aranacakKelime"), Keys.ENTER);
        // Listedeki birinci ve ikinci ürünü sepete ekleyiniz.
        kitapYurduPages.birinciUrunSepeteEkle.click();
        ReusableMethods.bekle(2);
        kitapYurduPages.ikinciUrunSepeteEkle.click();
        ReusableMethods.bekle(2);
        //ikinci urun sepete ekle eklendiğini dogrula
        kitapYurduPages.sepetimClick.click();
        Assert.assertTrue(kitapYurduPages.sepettekiUrun.isDisplayed());
        // birinci urunun sepete ekle eklendiğini urun listesi ile dogrula
        //Assert.assertTrue(kitapYurduPages.sepettekiIkinciUrun.isDisplayed());
        List<WebElement> urunList = kitapYurduPages.sepetimdekiUrunler;
      /*
        for (int i = 0; i < urunList.size() ; i++) {
            System.out.println(urunList.get(0).getText());
        }
       */
        urunList.forEach(t-> System.out.println(t.getText()));
        Assert.assertEquals(kitapYurduPages.aramaSonucuIlkUrun.getText(),urunList.get(1).getText());
        //  İlk ürünün miktarını 2, ikinci ürünün miktarını 3 olarak değiştiriniz.
        kitapYurduPages.sepeteGit.click();
        kitapYurduPages.ilkUrunMiktar.clear();
        kitapYurduPages.ilkUrunMiktar.sendKeys("2");
        ReusableMethods.bekle(1);
        kitapYurduPages.ikinciUrunMiktar.clear();
        kitapYurduPages.ikinciUrunMiktar.sendKeys("3");
//"Alisverişe devam et" fonksiyonunun görünür olmadığını doğrulayınız.
        Assert.assertTrue(kitapYurduPages.alisVeriseDevamEt.isDisplayed());
// Ürünlere ait kontrol kutularını seçili hale getiriniz.
        kitapYurduPages.kontrolKutulari.click();
// Kontrol kutularının seçili olduğunu doğrulayınız.
        Assert.assertTrue(kitapYurduPages.kutularinSeciliOldugunuDogrulama.isEnabled());
// İkinci ürüne ait kontrol kutusunun seçimini kaldırınız.
        kitapYurduPages.ikinciUrunKontrolKutusu.click();
// Kontrol kutularının seçili olduğunu doğrulayınız.
        Assert.assertTrue(kitapYurduPages.kutularinSeciliOldugunuDogrulama.isEnabled());
// İkinci ürüne ait kontrol kutusunun seçimini kaldırınız.
        // ZATEN BU SECIMI KALDIRDIK...
//"Seçilenleri Daha Sonra Al" fonksiyonunun aktif olduğunu doğrulayınız.
        ReusableMethods.bekle(2);
        Assert.assertTrue(kitapYurduPages.secilenleriDahaSonraAl.isEnabled());
    }
}
