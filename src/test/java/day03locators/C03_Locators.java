package day03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {



    //1- Bir test class’i olusturun ilgili ayarlari yapin
    System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

    //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        if (linkElementleriList.size()==expectedLinkSayisi){
            System.out.println("Link sayisi testi passed");
        }else System.out.println("Link sayisi testi failed");

        //cookiesi kabul edin.

        List<WebElement> cookiLocateList=driver.findElements(By.className("fc-button-label"));
        cookiLocateList.get(0).click();
        Thread.sleep(1000);


    //4- Products linkine tiklayin
     //   driver.findElement(By.linkText(" Products")).click();

        driver.findElement(By.partialLinkText("Products")).click();

    //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi =driver.findElement(By.id("sale_image"));
        if(specialOfferElementi.isDisplayed()){
            System.out.println("Special Offer testi PASSED");
        }else System.out.println("Special Offer testi FAILED");

    //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.quit();
}
}
