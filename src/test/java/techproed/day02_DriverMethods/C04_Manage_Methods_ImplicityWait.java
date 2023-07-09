package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Manage_Methods_ImplicityWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir

        Tread.sleep () java kodlarını bizim belirttigimiz sure bekler.ve alt satıra gecer
         */

        //techproed sayfasına gidelim
        driver.navigate().to("https://www.techproeducation.com");

        //amazona gidelim
        driver.navigate().to("https://www.amazon.com");

        //techproed e geri gidelim
        driver.navigate().back();

        //sayfa basligini techpro icerdigini kontrol edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //tekrar amazon a gidelim
        driver.navigate().forward();

        //sayfa basligının Amazon icerdigini test edelim
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Amazon";
        if(actualTitle1.contains(expectedTitle1)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //sayfayi kapat
        driver.close();

/*
Task
Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin

*****TASK2*******

Y



 */


    }
}
