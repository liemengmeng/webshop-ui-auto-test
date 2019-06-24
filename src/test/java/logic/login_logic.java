package logic;


import com.fengzhaung.actions;
import com.fengzhaung.seleniumdriver;
import pages.login;




public class login_logic extends seleniumdriver {
    //账号密码登录

    public static void userlogin(String username,String password){
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

  }



