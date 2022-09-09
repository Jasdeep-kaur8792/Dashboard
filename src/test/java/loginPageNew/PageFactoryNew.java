package loginPageNew;

import org.openqa.selenium.WebDriver;


public class PageFactoryNew {

    WebDriver driver;
    private LogInPage loginPageNew;
    private DashBoard dash;

    public PageFactoryNew(WebDriver driver)
    {
        this.driver = driver;

    }

    public LogInPage getLoginPage()
    {
        if (loginPageNew == null) {
            loginPageNew = new LogInPage(driver);
        }
        return loginPageNew;
    }
    public DashBoard getDashBoard()
    {
        if (dash == null) {
            dash = new DashBoard(driver);
        }
        return dash;
    }

}
