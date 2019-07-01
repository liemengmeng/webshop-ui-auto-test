package logic;


import com.fengzhaung.actions;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.WebDriver;
import pages.login;




public class login_logic extends seleniumdriver {
    //账号密码登录
 static WebDriver driver=seleniumdriver.driver;
    public static void userlogin(String username,String password){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(login.loginName).sendKeys(username);
        driver.findElement(login.passWord).sendKeys(password);
        com.fengzhaung.actions.clik(login.longinbut);

    }
    //验证码登录

    public static void tellogin(String tel,String yanzheng){

    //点击切换手机号的登录按钮
        try {
            Thread.sleep(2000);
        }catch (Exception e ){
        }
  com.fengzhaung.actions.clik(login.tellogin);
   driver.findElement(login.tel).sendKeys(tel);
        try {
            Thread.sleep(62000);
        }catch (Exception e ){
        }
        driver.findElement(login.buttel).click();
    try {
        Thread.sleep(3000);
    }catch (Exception e ){
    }
    driver.findElement(login.yanzheng).sendKeys(yanzheng);
 actions.clik(login.longinbut);
}

//登录成功退出登录

    public static void out(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(login.out1);
        com.fengzhaung.actions.clik(login.out2);
    }

  }



