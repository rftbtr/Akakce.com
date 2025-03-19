package US_101;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_101Account extends BaseDriver {
    /**<pre>
     * --> Bu senaryoda sitede doğru bilgiler girilerek hesap açma senaryosu sağlanmıştır.
     *
     * --> In this scenario, the account opening scenario was provided by entering the correct information on the site.</pre>*/
    @Test
    public void TC_0101AccountTest() {
        driver.navigate().to("https://www.akakce.com/");
        MyFunc.sleep(2);
        Assert.assertEquals("Yanlış sayfaya girldi", "https://www.akakce.com/", driver.getCurrentUrl());
        System.out.println("Akakçe sayfasına girildi");
        MyFunc.sleep(2);

        WebElement signUp = driver.findElement(By.cssSelector("[id='H_st_v8'] + div >:nth-child(1)"));
        Assert.assertEquals("Yanlış sayfaya girldi", "https://www.akakce.com/", driver.getCurrentUrl());
        System.out.println("Hesap aç görüntülendi");
        signUp.click();
        MyFunc.sleep(2);

        WebElement name = driver.findElement(By.cssSelector("[id='FrmRnuS'] span > input"));
        name.sendKeys("Behlul");
        MyFunc.sleep(2);
        Assert.assertEquals("Behlul", name.getAttribute("value"));
        System.out.println("Ad girişi başarılı");
        MyFunc.sleep(2);

        WebElement surname = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(7) >input"));
        surname.sendKeys("Kacar");
        MyFunc.sleep(2);
        Assert.assertEquals("Kacar", surname.getAttribute("value"));
        System.out.println("Soyad girişi başarılı");
        MyFunc.sleep(2);

        WebElement email = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(9) >input"));
        email.sendKeys("fadoda7438@dmener.com");
        MyFunc.sleep(2);
        Assert.assertEquals("jisita7361@cybtric.com", email.getAttribute("value"));
        System.out.println("Email girişi başarılı");
        MyFunc.sleep(2);

        WebElement reEmail = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(11) >input"));
        reEmail.sendKeys("fadoda7438@dmener.com");
        MyFunc.sleep(2);
        Assert.assertEquals("fadoda7438@dmener.com", reEmail.getAttribute("value"));
        System.out.println("Tekrar Email girişi başarılı");
        MyFunc.sleep(2);

        WebElement password = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(13) >input"));
        password.sendKeys("Bugfathers04");
        MyFunc.sleep(2);
        Assert.assertEquals("Bugfathers04", password.getAttribute("value"));
        System.out.println("Şifre girişi başarılı");
        MyFunc.sleep(2);

        WebElement rePassword = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(15) >input"));
        rePassword.sendKeys("Bugfathers04");
        MyFunc.sleep(2);
        Assert.assertEquals("Bugfathers04", rePassword.getAttribute("value"));
        System.out.println("Tekrar Şifre girişi başarılı");
        MyFunc.sleep(2);

        WebElement gender = driver.findElement(By.cssSelector("[id='FrmRnuS'] span ~ span label+label >input"));
        gender.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", gender.isSelected());
        System.out.println("Erkek seçildi");
        MyFunc.sleep(2);

        WebElement city = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(18) select >:nth-child(2)"));
        city.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", city.isSelected());
        System.out.println("İl doğru girldi");
        MyFunc.sleep(2);

        WebElement district = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(19) label + select >:nth-child(6)"));
        district.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", district.isSelected());
        System.out.println("ilçe doğru girldi");
        MyFunc.sleep(2);

        WebElement day = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(23) span select >:nth-child(2)"));
        day.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", day.isSelected());
        System.out.println("Gün doğru girldi");
        MyFunc.sleep(2);

        WebElement month = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(23) span + span select >:nth-child(2)"));
        month.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", month.isSelected());
        System.out.println("Ay doğru girldi");
        MyFunc.sleep(2);

        WebElement year = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(23) span + span + span select >:nth-child(14)"));
        year.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", year.isSelected());
        System.out.println("Yıl doğru girldi");
        MyFunc.sleep(2);

        WebElement accept = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(24) input"));
        accept.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", accept.isSelected());
        System.out.println("Sözleşme kabul et seçildi");
        MyFunc.sleep(2);

        WebElement notification = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(25) input"));
        notification.click();
        MyFunc.sleep(2);
        Assert.assertTrue("Hatalı seçim", notification.isSelected());
        System.out.println("Bildirimleri kabul et seçildi");
        MyFunc.sleep(2);

        WebElement submit = driver.findElement(By.cssSelector("[id='FrmRnuS'] >:nth-child(27) "));
        submit.click();
        MyFunc.sleep(5);
        Assert.assertTrue("Hatalı seçim", submit.isSelected());
        System.out.println("Hesap Aç seçildi");

        WaitAndClose();
    }
}
