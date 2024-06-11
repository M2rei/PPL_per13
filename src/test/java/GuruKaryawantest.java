import org.example.GuruKaryawan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GuruKaryawantest {
    @Test
    public void testGuruKaryawan() {

        // Setup WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/profile/guru");

        // Execute the test actions
        GuruKaryawan guru = new GuruKaryawan(driver);


    }
}
