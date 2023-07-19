package grupcalismalarimiz.tests.day02;

import grupcalismalarimiz.pages.KitapYurduPages;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_Kitap_Yurdu {
    @Test
    public void test01() {
        //Test Görevi:
        //https://www.kitapyurdu.com/ adresine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("kitapYurduUrl"));
        //Anasayfanın açıldığını sayfa URL'si ile doğrulayınız.
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("kitapYurduUrl"));
        //Anasayfanın açıldığını sayfa başlığı ile doğrulayınız. (Kitapyurdu, Kitapla buluşmanın en kolay yolu)
        Assert.assertEquals(Driver.getDriver().getTitle(), "Kitapyurdu, Kitapla buluşmanın en kolay yolu");

        //Anasayfada "Haftanın Yayınevi", "En Çok Satılanlar" ve "Ayın Yayınevleri" başlıklarının bulunduğunu doğrulayınız.
        KitapYurduPages kitapYurduPages = new KitapYurduPages();
        Assert.assertTrue(kitapYurduPages.haftaninYayinevi.isDisplayed());
        Assert.assertTrue(kitapYurduPages.ayinYayinevi.isDisplayed());
        Assert.assertTrue(kitapYurduPages.enCokSatilanlar.isDisplayed());

        //Üye girişi butonunun üzerindeki metnin "Giriş Yap" olduğunu doğrulayınız.
        Assert.assertEquals(kitapYurduPages.girisYap.getText(), "Giriş Yap");
        //"Üye Ol" butonunun linkinin "https://www.kitapyurdu.com/index.php?route=account/register" olduğunu doğrulayınız.

        //En Çok Satılanlar bölümündeki yazar isimlerinin hepsinin span tagı içerisinde olduğunu doğrulayınız.
        //En Çok Satılanlar bölümündeki yazar isimlerinin hepsinin font ailesinin "Arial, Helvetica, sans-serif" olduğunu doğrulayınız.
        //Haffont-familytanın Yayınevi bölümündeki ilk kitabın resim genişliğinin 120, yüksekliğinin 174 olduğunu doğrulayınız.
        //quit() ve close() metotları arasındaki farkı inceleyelim.
    }
}
