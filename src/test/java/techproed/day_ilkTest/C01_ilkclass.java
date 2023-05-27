package techproed.day_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
       //java uygulamalarında system ozelliklerini ayarlamak icin "setProperty ()" methodu ile kullanırız.
        System.out.println(System.getProperty("webdriver.chrome.driver"));//"src/resources/drivers/chromedriver.exe" yolu yazdırır
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.techproeducation.com");
    }
}
