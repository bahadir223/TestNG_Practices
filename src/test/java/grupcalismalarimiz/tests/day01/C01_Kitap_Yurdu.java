package grupcalismalarimiz.tests.day01;

import grupcalismalarimiz.pages.KitapYurduPages;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
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
        kitapYurduPages.ikinciUrunSepeteEkle.click();


        // ikinci urun sepete ekle eklendiğini dogrula
        kitapYurduPages.sepetim.click();
        Assert.assertTrue(kitapYurduPages.enSonEklenen.isDisplayed());

        // birinci urunun sepete ekle eklendiğini urun listesi ile dogrula
        List<WebElement> urunList= kitapYurduPages.sepetimdekiUrunler;
        for (int i = 0; i < urunList.size() ; i++) {

        }
        Assert.assertEquals(kitapYurduPages.aramaSonucuIlkUrun.getText(),urunList.get(1).getText());


        // İlk ürünün miktarını 2, ikinci ürünün miktarını 3 olarak değiştiriniz.
        //"Alisverişe devam et" fonksiyonunun görünür olmadığını doğrulayınız.
        // Ürünlere ait kontrol kutularını seçili hale getiriniz.
        // Kontrol kutularının seçili olduğunu doğrulayınız.
        // İkinci ürüne ait kontrol kutusunun seçimini kaldırınız.
        // Kontrol kutularının seçili olduğunu doğrulayınız.
        // İkinci ürüne ait kontrol kutusunun seçimini kaldırınız.
        //"Seçilenleri Daha Sonra Al" fonksiyonunun aktif olduğunu doğrulayınız.



        //Assert.assertTrue(kitapYurduPages.ilkEklenen.isDisplayed());
    }
}
