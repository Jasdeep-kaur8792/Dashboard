package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
    WebDriver driver;
    By clickDashBoard= By.partialLinkText(" (//*[contains(text(),'Dashboard')])[2]");

    public DashBoard(WebDriver driver) {
        this.driver = driver;
    }

    public void click()
    {
    driver.findElement(clickDashBoard).click();
    }
    }


