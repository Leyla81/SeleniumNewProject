package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.get("https://techproeducation.com");

        //getTitle():sayfa baslıgını verir
        System.out.println("Amozon Actual title : "+driver.getTitle());
        System.out.println("Techproeducation actual title : " +driver.getTitle());//son acılan sayfanın baslıgını verir
      //Techproeducation actual title : Techpro Education | Online It Courses & Bootcamps


       //getCurrentUrl():gidilen sayfanın url ini verir
        System.out.println("Techproed actual url : "+driver.getCurrentUrl());//Techproed actual url : https://techproeducation.com/

        //getPageSources() acılan sayfanın kaynak kodlarını verir.
        System.out.println(driver.getPageSource());

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());


driver.close();





    }

}
