package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement buttonLogin;
    @FindBy(id = "userSelect")
    WebElement userSelect;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnLoginSubmit;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement checkButtonLogout;
    @FindBy(xpath = "//*[contains(text(),'Harry Potter')]")
    WebElement checkInfoLogin;

    public void clickSubmit() {
        buttonLogin.click();
    }
    public  void chooseUserToLogin(String username){
        userSelect.click();
        List<WebElement> listUser = userSelect.findElements(By.tagName("option"));
        for(WebElement user : listUser) {
            if (user.getText().equals(username)){
                Select userSelects = new Select(userSelect);
                userSelects.selectByVisibleText(username);
            }
        }
    }
    public void clickSubmitLogin(){
        btnLoginSubmit.click();
    }
    public void setCheckLoginSuccess(){
        WebElement checkButtonLogout1 =  checkButtonLogout;
        Assert.assertTrue(checkButtonLogout1.isDisplayed());
    }

    public void setCheckInfoLogin(){
//        WebElement checkInfo = checkInforLogin;
        Assert.assertEquals(checkInfoLogin.getText(), "Harry Potter", "The info of user is failed!");
    }


}
