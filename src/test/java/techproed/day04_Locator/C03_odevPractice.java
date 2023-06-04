package techproed.day04_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_odevPractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //Techproeducation sayfasına gidelim
        //Çıkan reklamı locate edip kapatalım
        //Arama bölümünde qa aratalım
        //Sayfa başlığının qa içerdiğini doğrulayalım
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        //Carrer Opportunities In QA linkine tıklayalım
        //Başlığın Opportunities içerdiğini test edelim
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım













    }
}
