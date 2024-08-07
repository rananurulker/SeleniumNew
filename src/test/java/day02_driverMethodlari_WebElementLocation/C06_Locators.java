package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin
        driver.findElement(By.id("global-search"))
                .sendKeys("phone"+ Keys.ENTER);


        // arama sonucunda 3'den fazla urun bulunabildigini test edin

        //1.yontem arama sonuc yazisi olan "4 products found" yazisindaki
        // 4u sayi olarak kaydedip 3ten buyuk oldugunu test ederim

        WebElement aramaSonucElementi=driver.findElement(By.className("product-count-text"));
       // System.out.println(aramaSonucElementi.getText());// 4 Products Found

        String aramaSonucYazisi= aramaSonucElementi.getText();
        aramaSonucYazisi=aramaSonucYazisi.replaceAll("\\D","");//4



         int actualAramaSonucSayisi= Integer.parseInt(aramaSonucYazisi);//4
         int expectedMinSOnucSayisi= 3;

         if (actualAramaSonucSayisi>expectedMinSOnucSayisi){
             System.out.println("Arama sonuc sayisi testi Passed");

         }else System.out.println("Arama sonuc sayisi testi FailedD");
         // sayfayi kapatin


         //2. yontem bulunan uruneleri bir liste olarak kaydedip
        //listenin sizeinin 3ten buyuk oldugunu test edebiliriz

        List<WebElement> bulunanUrunELementleriList =driver.findElements(By.className("prod-img"));
       if (bulunanUrunELementleriList.size()>expectedMinSOnucSayisi){
           System.out.println("Arama sonuc sayisi testi Passed");

       }else System.out.println("Arama sonuc sayisi testi Failed");

        Thread.sleep(3000);
        driver.quit();
    }
}
