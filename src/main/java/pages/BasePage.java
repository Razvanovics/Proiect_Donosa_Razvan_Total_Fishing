package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver114.exe");
        driver = new ChromeDriver();
        String url = "https://www.totalfishing.ro/";
        driver.get(url);//Methoda care porneste Chrome

        LOG.info("Open Browser Maximized");
        driver.manage().window().maximize();//Methoda care Porneste Chrome in Maximized Window

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Comanda ce face ca programul sa astepte 10 secunde pentru incarcarea fiecarui Element din DOM-ul paginii Web
    }

    public static void tearDown() { //Methoda care inchide browser-ul.
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms) { //Methoda care sa faca pauza intre test case "sleep"

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl() {
        return "https://www.totalfishing.ro/";
    }

    public static String getBaseUrl() { //Methoda prin care putem adauga noi in loc de Index.htlml sau adresa paginii principala, cu orice alt link dorit, in cazul meu replacement este "https://www.totalfishing.ro/customer/account/create/"

        String baseurl = returnBaseUrl();
        if (baseurl != null) {
            return baseurl.replace("https://www.totalfishing.ro/", ""); // De discutat aici ce punem ca Replacement oare "https://www.totalfishing.ro/customer/account/create/"

        }
        return baseurl;
    }

}
