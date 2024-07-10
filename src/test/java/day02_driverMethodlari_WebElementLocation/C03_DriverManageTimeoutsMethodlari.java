package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageTimeoutsMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testotomasyonu.com");

        /*
        Thread.sleep() Javadan gelir
        ve kodlarin calismasini bizim belirledigimiz surece durdurur.

        testi ilk defa yazarken test adimlarini gormemiz veya bir sunum yaptigimizda sunum yaptigimiz
        kisilere adimlari gostermemiz acisindan kullanimi uygundur.

        Bazen de bilgisayarimizin veya internetin hizindan dolayi
        kodlar hizli ilerlediginde istedgimiz adimlari gerceklestiremeyebilir
        bu durumda mecbur kalirsak Thread.sleep() kullanilabilir.

        Eger testi hazirlamayi bitirdik,
        hiz acisindan da beklemeyi mecbur kilan bir durum yoksa
        Thread.sleep()leri silmek de faydalidir.
         */

        /*
        implicitlyWait fakrli olarak goreve dayali beklemeyi yapar

        biz 10 saniye tanimladigimizda gorevi yapmak icin max 10 saniye bekler
        daha erken biterse yoluna devam eder, 10 saniyenin dolmasini beklemez
        ancak 10 saniye dolmasina ragmen gorev bitmedi ise exception firlatir

        implicityWait iki temel gorev icin bekleme yapar
        1- sayfanin acilip ogelerin yuklenmesi
        2-herhangi bir ogeyi kullanmamiz gerektiginde o ogeyi bulmak

         */

        driver.quit();
    }
}
