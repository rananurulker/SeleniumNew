package day01driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkOtomasyon {
    public static void main(String[] args) throws InterruptedException {

        /*
        kurulum dosyalarini proje altina kopyalamak selenium ve chrome driveri
        projeye eklemek icin yeterli degildir.

        seleniumu kurmak icin jar dosyalarini olusturdugumuz her projede bir kez
        porjeye tanitmaliyiz

        chrome driver.exe ise
        her classta webdriver objesi olusturulurken kullanilir
        */

        /*
        selenium bizim istedigimiz tum otomasyonlari olusturacagimiz web driver objesi ile yapar
        selenium ile bir otomasyon yapilacaksa once webdriber objesi olusturulmalidir
         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(5000);

        // driver.close();
        // acılan wındowu kapatır
        driver.quit();
        //tum wındowları kapatır
    }
}
