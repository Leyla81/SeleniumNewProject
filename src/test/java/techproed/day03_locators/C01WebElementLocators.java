package techproed.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01WebElementLocators {

    public static void main(String[] args) {

        // https://www.amazon.com sayfasına gidiniz
        // aramakutusunu locate ediniz ve Nutella aratınız
        // sayfayı kapatınız


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");//1.olarak yolu goster
        WebDriver driver = new ChromeDriver();//2. olarak driver objesi olustururuz

        driver.manage().window().maximize();//3. olarak ekrani buyuturuz

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Web sayfasındaki yuklemelerin tatmlanması icin beklenen süre

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // aramakutusunu locate ediniz ve Nutella aratınız
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);//arama motoruna nutella yazdırız ve enter tusu ile aratirız

        //sayfayi kapatınız.
        driver.close();


    }
}
