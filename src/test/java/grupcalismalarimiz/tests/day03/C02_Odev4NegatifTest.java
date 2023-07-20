package grupcalismalarimiz.tests.day03;

import grupcalismalarimiz.pages.BlueRentAlCarsPage;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import grupcalismalarimiz.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_Odev4NegatifTest {
    //Description:
    //Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
    //Acceptance Criteria:
    //Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
    //Error Message: email must be a valid email
    //Dogru email uzantisi girildiğinde hata mesajı alınmamalı


    @Test
    public void test01() {
        //Önce siteye gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsuRL"));
        //login yapalım.
        BlueRentAlCarsPage blueRentAlCarsPage = new BlueRentAlCarsPage();
        blueRentAlCarsPage.loginButton.click();
        //Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
        blueRentAlCarsPage.eMail.sendKeys(ConfigReader.getProperty("gecersizMail"));
        Assert.assertTrue(blueRentAlCarsPage.mailMustBeValid.isDisplayed());
        //Dogru email uzantisi girildiğinde hata mesajı alınmamalı
        blueRentAlCarsPage.eMail.clear();
        ReusableMethods.bekle(2);
        blueRentAlCarsPage.eMail.sendKeys(ConfigReader.getProperty("email"));
        Assert.assertFalse(blueRentAlCarsPage.mailMustBeValid.isDisplayed());
    }
}
