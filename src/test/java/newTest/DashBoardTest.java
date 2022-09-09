package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

public class DashBoardTest extends Baseclass {

    @Test
    public void dashBoard() throws InterruptedException
    {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getDashBoard().click();

    }
}
