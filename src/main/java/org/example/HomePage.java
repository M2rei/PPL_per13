package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    public By getTestHomePage(){
        return By.xpath("//*[contains(text(), 'Contact Us')]");
    }

    public void clickProfileAndSejarahMenu() {
        // Temukan tombol dropdown Profil
        WebElement profileDropdown = driver.findElement(By.id("dropdownNavbarLink"));
        profileDropdown.click();

        // menemukan dan klik link Sejarah di dropdown Profil
        WebElement sejarahLink = driver.findElement(By.linkText("Sejarah"));
        sejarahLink.click();

        // Memeriksa apakah nantinya telah diarahkan ke halaman Sejarah
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("profile/sejarah")) {
            System.out.println("Pengguna berhasil diarahkan ke halaman Sejarah.");
        } else {
            System.out.println("Gagal mengarahkan pengguna ke halaman Sejarah.");
        }
    }
}
