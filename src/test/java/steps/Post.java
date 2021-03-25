package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Post extends Base {

    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Dado("^que acesso a Wikipedia em portugues$")
    public void que_acesso_a_Wikipedia_em_portugues()  {
        base.driver.get(base.url);
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto)  {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Entao("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibe_a_expressao_no_titulo_da_guia(String produto) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(base.driver, 5);
        wait.until(ExpectedConditions.titleContains(produto));
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
