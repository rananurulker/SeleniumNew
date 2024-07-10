package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_locatorVeWebElementKullanimi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu ana sayfaya gidin
        driver.get("http://testotomasyonu.com");

        // arama kutusunu locate edin
        //idsi global-search olan web element dedigimizde unique degere ulasiyoruz.
        //locator olarak By.id()kullanabiliriz.

        //locate etme belirlenen unique adresi ve locatori kullanarak
        //istenen web elementi icinde bulundugumuz classtan kullanilir hale getirmektir.

        WebElement aramaKutusu=driver.findElement(By.id("global-search"));

        // arama kutusuna "phone" yazdirin
        aramaKutusu.sendKeys("phone");


        // ENTER'a basarak aramayi yaptirin
        aramaKutusu.submit();

        // sayfayi kapatin

        driver.quit();
    }
}
