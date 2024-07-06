package day01driverMethodlari;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_firstTestAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

    // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
    driver.get("https://www.testotomasyonu.com");

    // 2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

    // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitle="Test Otomasyonu";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi passed");
        }else System.out.println("Title testi failed");

    // 4. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
        // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedURL=  "https://testotomasyonu.com/";
        String actualURL= driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
            System.out.println("URL testi basarili");
        } else System.out.println("URL testi failed");

    // 6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());//53EAC991087F6603280A01C3EE51138F

        // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedHtmlIcerik= "otomasyon";
        String actualPageSource= driver.getPageSource();

        if (actualPageSource.contains(expectedHtmlIcerik)){
            System.out.println("Sayfa kaynagi testi passed");
        }else System.out.println("Sayfa kaynagi testi failed");

    // 8. Sayfayi kapatin.
         Thread.sleep(3000);
         driver.quit();


    }
}
