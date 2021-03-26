package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @Given("^que acesso a Wikipedia em portugues$")
    public void que_acesso_a_Wikipedia_em_portugues()  {
        base.driver.get(base.url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto)  {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Then("^Exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibe_a_expressao_no_titulo_da_guia(String produto){
        WebDriverWait wait = new WebDriverWait(base.driver, 5);
        wait.until(ExpectedConditions.titleContains(produto));
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
