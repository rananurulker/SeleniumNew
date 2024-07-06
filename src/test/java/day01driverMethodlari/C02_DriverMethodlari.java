package day01driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // her acilan classta once webdriver olusturmaliyiz

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());//Amazon.com
        System.out.println(driver.getCurrentUrl());//https://www.amazon.com/
        System.out.println(driver.getPageSource());//HTML sayfanin tum kaynak kodlarini getirir
        System.out.println(driver.getWindowHandle());//EEA72E77752C91D97C8A1E35C61EC23F

        //Selenium WebDriver actigi her browser icin benzersiz bir handle degeri uretir
        //eger testimiz calisirken driver objesi ile birden fazla window acildiysa
        //bu windowlar arasinda gecisi window handle degerleri ile yapabiliriz.

        Thread.sleep(3000);
        driver.quit();
    }
}
