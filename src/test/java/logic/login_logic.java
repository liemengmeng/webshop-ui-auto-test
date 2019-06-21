package logic;
import com.fengzhaung.actions;
import com.fengzhaung.seleniumdriver;

import org.testng.annotations.Test;
import pages.login;




public class login_logic extends seleniumdriver {
    //账号密码登录

    public static void userlogin(String username,String password){
        seleniumdriver.open("chrome");
        seleniumdriver.driver.get("http://192.168.100.17/#/Login");
        driver.manage().window().maximize();
  driver.findElement(login.loginName).sendKeys( username);
  driver.findElement(login.passWord).sendKeys(password);
  driver.findElement(login.longinbut).click();

    }
    //验证码登录

    public static void tellogin(String tel,String yanzheng){
    //点击切换手机号的登录按钮
   driver.findElement(login.tellogin).click();
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
        actions.clik(login.out1);
        actions.clik(login.out2);
    }
    @Test
    public static void show(){
        login_logic.userlogin("13592280532","lmm123456");
    }
}

