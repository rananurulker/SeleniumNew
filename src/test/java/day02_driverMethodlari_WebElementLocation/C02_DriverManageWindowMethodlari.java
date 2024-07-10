package day02_driverMethodlari_WebElementLocation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_DriverManageWindowMethodlari {
    public static void main(String[] args) throws InterruptedException {

        LocalTime localDateTime=LocalTime.now();
        long baslangicSaniye=LocalTime.now().toSecondOfDay();

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);


        driver.get("https://testotomasyonu.com");

        System.out.println("Maximize size: "+ driver.manage().window().getSize());
        System.out.println("Maximize Konum: "+ driver.manage().window().getPosition());
        Thread.sleep(2000);

        //eger tum ekrani kaplamasini istersem
        driver.manage().window().fullscreen();
        System.out.println("Full screen size: "+ driver.manage().window().getSize());
        System.out.println("Full screen konum: "+ driver.manage().window().getPosition());

        //konumu (200,200) ve boyutu da (800,500) yapin

        driver.manage().window().setPosition(new Point(200,200));
        driver.manage().window().setSize(new Dimension(800,500));
        System.out.println("Ozel boyut size: "+ driver.manage().window().getSize());
        System.out.println("Ozel Boyut Konum: "+ driver.manage().window().getPosition());

        Thread.sleep(5000);
        driver.quit();

        LocalTime localDateTime2=LocalTime.now();
        long bitisSaniye=LocalTime.now().toSecondOfDay();

        System.out.println("Sure: "+(bitisSaniye-baslangicSaniye));

    }
}
