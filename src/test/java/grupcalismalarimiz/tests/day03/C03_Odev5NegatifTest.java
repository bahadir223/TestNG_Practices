package grupcalismalarimiz.tests.day03;

import grupcalismalarimiz.pages.BlueRentAlCarsPage;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import grupcalismalarimiz.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Odev5NegatifTest {
    //Description:
    //Geçerli giriş yapmadan rezervasyon yapamamalı
    //Acceptance Criteria:
    //Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
    //Ve giris yapilmadiginda
    //Hata mesaji almali : Please first login
    //Giris yapildiginda hata mesaji alınmamalı

    @Test
    public void test01() {
        //siteye giriş yapiyoruz
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsuRL"));
        //ddm den bir araba seçtireceğiz.
        BlueRentAlCarsPage blueRentAlCarsPage = new BlueRentAlCarsPage();
        Select select = new Select(blueRentAlCarsPage.ddm);
        select.selectByVisibleText("BMW i3");
        blueRentAlCarsPage.ddm.sendKeys(Keys.TAB, ConfigReader.getProperty("pickUp"),
                Keys.TAB, ConfigReader.getProperty("dropOff"), Keys.TAB,
                ConfigReader.getProperty("pickUpTarih"), Keys.TAB,
                ConfigReader.getProperty("pickUpSaat"), Keys.TAB,
                ConfigReader.getProperty("dropOffTarih"), Keys.TAB, ConfigReader.getProperty("dropOffSaat"));
        //Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
        //Ve giris yapilmadiginda
        //Hata mesaji almali : Please first login
        //blueRentAlCarsPage.continueReservation.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", blueRentAlCarsPage.continueReservation);
        ReusableMethods.bekle(2);
        Assert.assertTrue(blueRentAlCarsPage.mesajVerify.isDisplayed());

        //Giris yapildiginda hata mesaji alınmamalı
        js.executeScript("arguments[0].click();", blueRentAlCarsPage.loginButton);
        blueRentAlCarsPage.eMail.sendKeys(ConfigReader.getProperty("email"),
                Keys.TAB, ConfigReader.getProperty("gecerliPassword"), Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(blueRentAlCarsPage.girisYapildiVerify.isDisplayed());

    }
}
