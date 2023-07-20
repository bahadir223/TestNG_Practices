package grupcalismalarimiz.tests.day03;

import grupcalismalarimiz.pages.BlueRentAlCarsPage;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import grupcalismalarimiz.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_OdevUcNegatifTest {

    //Description:
    //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
    //Acceptance Criteria:
    //Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
    //Hata Mesaji:
    //Bad credentials
    //Test Data:
    //Customer email: jack@gmail.com
    //Customer password: fakepass

    @Test
    public void test01() {
        //Önce siteye gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcarsuRL"));
        //login yapalım.
        BlueRentAlCarsPage blueRentAlCarsPage = new BlueRentAlCarsPage();
        blueRentAlCarsPage.loginButton.click();
        blueRentAlCarsPage.eMail.sendKeys(ConfigReader.getProperty("email"), Keys.TAB,
                ConfigReader.getProperty("password"), Keys.ENTER);
        ReusableMethods.bekle(2);
        Assert.assertTrue(blueRentAlCarsPage.mesajVerify.isDisplayed());

    }
}
