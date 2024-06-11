import org.example.GuruKaryawan;
import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HomePageTest {
    @Test
    public void HomePageTest() {
        // Inisialisasi WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/home");

        HomePage home = new HomePage(driver);
        home.clickProfileAndSejarahMenu();
        driver.quit();
    }
}

