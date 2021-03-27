package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {

    WebDriver driver;
    String url;


    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver88.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        url = "https://pt.wikipedia.org/wiki/";
    }

    @After
    public void encerrar(){
        driver.quit();
    }

    @Test
    public void consultaArtigo() throws InterruptedException {

        driver.get(url);
        driver.findElement(By.name("search")).sendKeys("Ovo de Pascoa", Keys.ENTER);
        Thread.sleep(1000);
        assertTrue(driver.getTitle().contains("Ovo de Pascoa"));
    }

}
