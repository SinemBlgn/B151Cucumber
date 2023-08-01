package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TechproStepDefinition {
    @Given("kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        TechproPage techproPage=new TechproPage();
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));
    }


    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {

    }

    @When("cikan dropdown da mobile developer linkine tiklar")
    public void cikanDropdownDaMobileDeveloperLinkineTiklar() {
    }

    @And("sayfa basliginin Mobile icerdigini test eder")
    public void sayfaBasligininMobileIcerdiginiTestEder() {
    }
}
