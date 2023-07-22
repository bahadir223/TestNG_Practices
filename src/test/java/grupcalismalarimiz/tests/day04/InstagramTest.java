package grupcalismalarimiz.tests.day04;

import com.github.javafaker.Faker;
import grupcalismalarimiz.pages.InstagramPage;
import grupcalismalarimiz.utilities.ConfigReader;
import grupcalismalarimiz.utilities.Driver;
import grupcalismalarimiz.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class InstagramTest {
    Faker faker;

    @Test
    public void instagramTest() {
        Driver.getDriver().get(ConfigReader.getProperty("instagramUrl"));
        InstagramPage instagram = new InstagramPage();

        //1- Verify what the user can create a new instagram account with a valid email adress or phone number.
        //1- Kullanıcının geçerli bir e-posta adresi veya telefon numarası ile yeni bir instagram hesabı oluşturabileceğini doğrulayın.
        instagram.kaydol.click();
        instagram.mail.sendKeys(ConfigReader.getProperty("mail"), Keys.TAB, ConfigReader.getProperty("name"),
                Keys.TAB, ConfigReader.getProperty("kullaniciAdi"), Keys.TAB, ConfigReader.getProperty("password"));
        ReusableMethods.bekle(2);
        instagram.submit.click();
        ReusableMethods.bekle(3);

        //2- Verify that the user can access their existing instagram account by entering their login credentials.
        //2- Kullanıcının oturum açma kimlik bilgilerini girerek mevcut instagram hesabına erişebildiğini doğrulayın.
        // 3- Verify that the user can search for and follow other instagram users.
        //3- Kullanıcının diğer instagram kullanıcılarını arayabildiğini ve takip edebildiğini doğrulayın.

        //4- Verify that the user can post photos and videos on their instagram profile.
        //4- Kullanıcının instagram profilinde fotoğraf ve video yayınlayabildiğini doğrulayın.

        //5- Verify that the user can like, comment on, and shair posts from other users they follow.
        //5- Kullanıcının takip ettiği diğer kullanıcıların gönderilerini beğenebileceğini, yorum yapabileceğini ve paylaşabileceğini doğrulayın.

        //6-
        //
    }
}
