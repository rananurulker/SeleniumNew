package day03locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://www.testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
       WebElement clickTheButton= driver.findElement(By.xpath("//button[@id='sub-btn']"));
       clickTheButton.click();

        //3- Remove butonu’nun gorunur oldugunu test edin
        System.out.println("Remove button test: " + clickTheButton.isDisplayed());

        //4- Remove tusuna basin
        WebElement removeTest = driver.findElement(By.xpath("//button[@class='remove-btn']"));

        removeTest.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveTest = driver.findElement(By.xpath("//h2"));

        System.out.println("Add/Remove Elements testi : " + addRemoveTest.isDisplayed());

        Thread.sleep(3000);
        driver.quit();

    }
}
