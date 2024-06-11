package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuruKaryawan {
    WebDriver driver;

    public GuruKaryawan(WebDriver driver) {
        this.driver = driver;
    }

    public By getTestGuruKaryawan() {
        return By.xpath("//*[contains(text(), 'Guru Karyawan')]");
    }

    public void filterGuruKaryawan() {

        // Click the "Guru" filter
        WebElement guruFilter = driver.findElement(By.xpath("//*[contains(text(), 'Guru')]"));
        guruFilter.click();

        // Click the "Kepala Sekolah" filter
        WebElement kepalaSekolahFilter = driver.findElement(By.xpath("//*[contains(text(), 'Kepala Sekolah')]"));
        kepalaSekolahFilter.click();

        // Click the "Staf" filter
        WebElement stafFilter = driver.findElement(By.xpath("//*[contains(text(), 'Staf')]"));
        stafFilter.click();
    }

}
