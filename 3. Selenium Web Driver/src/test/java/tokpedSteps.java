import driverSetup.driverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class tokpedSteps {
    private WebDriver webDriver;
    public tokpedSteps(){
        super();
        this.webDriver = driverSetup.webDriver;
    }
    @Given("user already on tokopedia page")
    public void userAlreadyOnTokopediaPage() {
        String URL = "https://www.tokopedia.com/";
        String currentUrl = webDriver.getCurrentUrl();
        assertEquals(URL, currentUrl);
    }

    @When("user search {string} and click search")
    public void userSearchAndClickSearch(String arg0) {
        tokpedPage a = new tokpedPage(webDriver);
        a.fillSearch(arg0);
        a.clickSearch();
    }

    @Then("user redirect to list product page")
    public void userRedirectToListProductPage() {
    }

    @And("user do scrolling on page")
    public void userDoScrollingOnPage() {
        tokpedPage a = new tokpedPage(webDriver);
        for (int i = 1; i <= 4; i++){
            a.scrollPage();
        }
    }
}
