package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends PageObject {
    //komponen dan interaksi yang akan dilakukan pada login page akan aku define di sini
    //1. field username, id : user-name
    //2. field password, id : password
    //3. login button, id : login-button
    //4. error message, xpath : //h3
    // a. mendefine cara ngambilnya setiap komponen

    private By fieldUsername(){
        return By.id("user-name"); //By.(apa)("value")
    }

    private By fieldPassword(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login-button");
    }

    private By errorMessage(){
        return By.xpath("//h3");
    } //gimana cara si robotnya nyari setiap komponen / elemennya

    private By headerProduct(){
        return By.xpath("//span[@class = 'title']");
    }

    public void headerDisplayed(){
        $(headerProduct()).isDisplayed();
    } //mencari elemen2 unik di page lain

    public void scrollDown(){
//        $("//body").sendKeys(Keys.END);
        $("//body").sendKeys(Keys.END);
        $("//body").sendKeys(Keys.chord(Keys.ALT, Keys.DELETE)); //kita mau kasih keyboard yg saling berbarengan
    }

    public void openUrl(){
        openAt("/");
    }

    public void inputUsername(String username){
        //method untuk memasukkan
        $(fieldUsername()).type(username); //$(By) -> cari yaa suatu element dengan selector By yang kaya gini
        //kita define ->
        // hasil pencarian itu adalah elementnya yang mana bisa kita kasih method
//        $(fieldUsername()) //--> ngasih command ke robotnya untuk nyari elemen / komponen yang kamu
        // $(By (apa yg mau kita cari)) default: $(By)
//        $(By.id("username")).isDisplayed();
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
        $(fieldPassword()).type(Keys.chord(Keys.END));
    }

    public void clickLoginBtn(){
        $(loginButton()).click();
    }

    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
    }
}
