import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tokpedPage extends tokpedLoc {
    public static WebDriver driver;
    public tokpedPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static void fillSearch(String arg0){
        searchField.click();
        searchField.sendKeys(arg0);
    }
    public static void clickSearch(){
        searchClick.click();
    }
    public static void scrollPage(){
        scroll.sendKeys(Keys.PAGE_DOWN);
    }

}
