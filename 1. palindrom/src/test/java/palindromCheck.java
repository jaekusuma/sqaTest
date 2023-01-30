import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class palindromCheck {
    private String text;
    private boolean result;

    @Given("a text {}")
    public void aTextText(String text) {
        this.text = text;
    }

    @When("checking whether the text is a palindrome")
    public void checkingWhetherTheTextIsAPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        this.result = text.equalsIgnoreCase(reverse);
    }

    @Then("the result should be {}")
    public void checkResult(String expectedResult) {
        boolean expected = expectedResult.equalsIgnoreCase("true");
        assertEquals(expected, this.result);
    }
}
