package logic;
import MyAssert.MyAssert;
import com.fengzhaung.actions;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.forgetPwd;
import pages.login;

public class forget_logic extends seleniumdriver {
    static WebDriver driver= seleniumdriver.driver;
public  static void skipForget(){
    //点击切换到账号密码登录
    driver.findElement(login.userlogin).click();
        //点击忘记密码页面跳转
   driver.findElement(forgetPwd.pwdBut).click();

    //校验url是否正确
    String url=driver.getCurrentUrl();
MyAssert.assertEquals(url,"http://192.168.100.17/#/reset");
}
//录入账号验证码
public static void luru(String user,String yanzheng){
       driver.findElement(forgetPwd.user).sendKeys(user);
    try {
        Thread.sleep(61000);
    }catch (java.lang.Exception e ){
    }
    actions.clik(forgetPwd.butCode);
    try {
        Thread.sleep(3000);
    }catch (java.lang.Exception e ){
    }
driver.findElement(forgetPwd.yanzheng).sendKeys(yanzheng);
}
//点击下一步
    public static void next(){
        //校验下一步按钮是否为可点击状态

        boolean but=  driver.findElement(forgetPwd.nextBut).isEnabled();
      if (but){
            driver.findElement(forgetPwd.nextBut).click();

          }

    }
//重置密码
    public static void resetpwd(String pwd1 ,String pwd2){
driver.findElement(forgetPwd.newpwd1).sendKeys(pwd1);
  driver.findElement(forgetPwd.newpwd2).sendKeys(pwd2);
   driver.findElement(forgetPwd.affirmBut).click();
    }
    //重置成功
    public static void succeed(){
    com.fengzhaung.actions.clik(forgetPwd.atonce);
        //获取当前页面url查看是否跳转到登录页
    String url= driver.getCurrentUrl();
    Assert.assertEquals(url,"http://192.168.100.17/#/Login");
    }


}
