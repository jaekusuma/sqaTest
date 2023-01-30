import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tokpedLoc {
    @FindBy(css = "[placeholder='Cari di Tokopedia']")
    public static WebElement searchField;
    @FindBy(css = ".css-1czin5k")
    public static WebElement searchClick;
    @FindBy(css = ".css-1y9pd8n-unf-heading")
    public static WebDriver filter;
    @FindBy(xpath = "/html[1]")
    public static WebElement scroll;
}
