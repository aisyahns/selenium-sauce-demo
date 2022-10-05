package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By sideMenu() {
        return By.id("react-burger-menu-btn");
    }
//    private By logoutBtn() {
//        return By.id("logout_sidebar_link");
//    }
    private By nameText(String text){
        return By.xpath("//a[text() ='" + text + "']");
    }
    private By fieldUsername = By.id("user-name");


    public void clickSideMenu(){
        $(sideMenu()).click();
    }

    public void clickLogoutBtn(){
        $(nameText("Logout")).click();
    }

    public void verifyInLogin(){
        $(fieldUsername).isDisplayed();
    }

}
