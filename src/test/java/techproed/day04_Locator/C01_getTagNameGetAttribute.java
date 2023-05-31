package techproed.day04_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("http://www.amazon.com");

        // arama kutusunu locate ediniz
         WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusunun tagName'inin "input" oldugunu test edin
        String actualTagName =aramaKutusu.getTagName();
        System.out.println(actualTagName);//input verir
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        // arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        //Arama kutusunun name attribute'ünün degerinin "field-keywords" oldugunu test edin
        String actualAttribute = aramaKutusu.getAttribute("name");//Attribute degerini test eder
        System.out.println(actualAttribute);
        String expectedAttribute ="field-keywords";//beklenen attribute degeridir

        if (actualAttribute.equals(expectedAttribute)){//actuelAttribute, expectedAttribute'e esit midir?
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        // sayfayı kapatın

           driver.close();

    }
}
