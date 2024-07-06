package day01driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excersize01 {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
       // WebDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
       //System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
       //WebDriver driver=new ChromeDriver();

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://testotomasyonu.com");

        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test passed.");
        } else {
            System.out.println("Title test failed.");
        }

        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedURL="https://testotomasyonu.com/";
        String actualURL=driver.getCurrentUrl();
        if (actualURL.equals(expectedURL)){
            System.out.println("URL test passed.");
        }else {
            System.out.println("URL test failed.");
        }

        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedHTMLcontent="otomasyon";
        String actualHTMLcontent=driver.getPageSource();

        if (actualHTMLcontent.contains(expectedHTMLcontent)){
            System.out.println("HTML test passed.");
        }else {System.out.println("HTML test failed");}

        //8. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.quit();


    }
}
