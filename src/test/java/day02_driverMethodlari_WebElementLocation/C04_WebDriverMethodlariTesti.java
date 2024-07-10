package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebDriverMethodlariTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1. Yeni bir class olusturun (TekrarTesti)
       // 2. Youtube web sayfasına gidin
        driver.get("https://www.youtube.com");
        //ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        String expectedTitle= "youtube";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Youtube title test Passed");
        } else {
            System.out.println("Youtube title test Failed");
            System.out.println("Actual Title: "+ actualTitle);
        }

       //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru URL'yi yazdırın.
        String expectedYoutubeUrlIcerik="youtube";
        String actualYotubeUrlIcerik=driver.getCurrentUrl();

        if (actualTitle.contains(expectedYoutubeUrlIcerik)){
            System.out.println("Youtube URL test passed");
        }else {
            System.out.println("Youtube URL test failed");
            System.out.println("Actual Youtbe URL: "+actualYotubeUrlIcerik);
        }
        Thread.sleep(3000);

       //4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");
        Thread.sleep(3000);

       //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
       //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
       //7. Testotomasyonu sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);
       //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
       //9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitleIcerik= "Test";
        String actualTitleIcerik=driver.getTitle();

        if (actualTitleIcerik.contains(expectedTitleIcerik)){
            System.out.println("Testotomasyonu title Passed");
        }else {
            System.out.println("Testotomasyonu title testi Failed");
            System.out.println("Actual Title: "+ actualTitleIcerik);
        }
       //10.Sayfa URL'sinin https://www.testotomasyonu.com/
        // olup olmadığını test edin, degilse doğru URL'yi yazdırın
        String expectedURL="https://www.testotomasyonu.com/";
        String actualURL=driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)){
            System.out.println("Testotomasyonu url testi passed");
        }else {
            System.out.println("Testotomasyonu url testi failed");
            System.out.println("Actual URL: "+actualURL);
        }
       //11.Sayfayi kapatin

         Thread.sleep(3000);
        driver.quit();

    }
}
