package packageName;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageStep {
    WebDriver driver;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        // Setup WebDriver
        driver = new FirefoxDriver();
        driver.get("http://127.0.0.1:8000/home");
    }

    @When("the user clicks on the profile dropdown")
    public void the_user_clicks_on_the_profile_dropdown() {
        // Click profile dropdown
        WebElement profileDropdown = driver.findElement(By.id("dropdownNavbarLink"));
        profileDropdown.click();
    }

    @When("the user clicks on the history link")
    public void the_user_clicks_on_the_history_link() {
        // Click history link
        WebElement historyLink = driver.findElement(By.linkText("Sejarah"));
        historyLink.click();
    }

    @Then("the user should be redirected to the history page")
    public void the_user_should_be_redirected_to_the_history_page() {
        // Verify redirection
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("profile/sejarah");
        driver.quit();
    }
}
