package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        /*
        9.satirin gorevi bilgisayarimizda fiziki olarak kullandigimiz chrome versiyonuna uygun
        selenium.dev sitesinden indirdigimiz ve kopya browser olusturmamizi saglayan
        chromedriver.exe dosyasini classimiza tanitmaktir.

        Selenium 4.0.0 versiyonu ile kutuphanelerine tum guncel browserlara
        ait driverlari yukledi
        boylece bir class olusturdugumuzda
        Bis Istersek kendi driverimizi 9. satira kullanarak tanitabilir.
        istersek 9. satiri atlayip seleniumun kendi driverlarini kullanabiliriz.
         */
        driver.get("https://www.testotomasyonu.com");
        driver.navigate().to("https://www.wisequarter.com");

        //ilk gidis icin navigate ve get ayi isleve sahiptir.
        Thread.sleep(2000);

        //tekrar testotomasyonu sayfasina gitmek icin
        driver.navigate().back();
        Thread.sleep(2000);

        //bir daha wise quartera gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
