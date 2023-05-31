package techproed.day04_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


// https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        // sonuc yazısını yazdırın
       List<WebElement > sonucYazisi =driver.findElements(By.className("sg-col-inner"));//birden fazla oldugu icin List icine aldim
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 155 results for "city bike" ===>verir

        // sonuc sayısını yazdırın
        String[]sonucSayisi =sonucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc Sayisi =  "+sonucSayisi[2]);

        // ilk ürünün locatini alın
        List<WebElement>urunler =driver.findElements(By.className("s-image"));
        WebElement ilkUrun =urunler.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());

        // ilk urune tıklayın
        ilkUrun.click();

        // sayfayı kapatın
        driver.close();

/*
        //ARAMA KUTUSUNUN HTML KODLARI
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
         placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
         tabindex="0" aria-label="Search Amazon" spellcheck="false">
         */
        //Relative Xpath syntax -->
        // tagname[@attributeName='attributeValue']
        //input[@type='text']
        //--(//input[@type='text'])[1]

       /* Aldigimiz xpath unique olmadigi zaman xpath' imizi parantez icine alarak index belirtebiliriz.
        Boylelikle webelementi List' e atip istedigimiz elementi almakla ugrasmayiz
         */
//techproeducation sayfasına gi
        //cıkan reklamı locate edip kapat
        //arama bolumunde qa aratalim
        //sayfa baslıgının qa icerdigini dogrulayalım
        //career opportunities In QA linkine gorunur ve erisebilir oldugunu kontrol edein
        //career opportunities In QA linkine tıklayalım
        //baslıgın opportunities icerdigini test edelim
        //tekrar anasayfaya donelim ve url in https: www.techproeducation icerdigini dogrulayalım









    }
}
