package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser ın konumunu yazdıralim
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());

        //Browser ın boyularını yazdıralim
        System.out.println("Sayfanın boyuntları : "+driver.manage().window().getSize());

        //Browser i maximize yapalıim,
        driver.manage().window().maximize();
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");

        //Browser ın konumunu yazdıralim
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());

        //Browser ın boyularını yazdıralim
        System.out.println("Sayfanın boyuntları : "+driver.manage().window().getSize());
        Thread.sleep(3000);

        // Browser i minimize yapalıim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //sayfayı full screen yapalim
        driver.manage().window().fullscreen();


driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
Thread.sleep(3000);

//sayfayı kapatalim
        driver.close();




    }
}
