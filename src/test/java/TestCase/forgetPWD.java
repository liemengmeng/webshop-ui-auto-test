package TestCase;

import MyAssert.MyAssert;
import com.fengzhaung.seleniumdriver;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class forgetPWD extends seleniumdriver {


@Test
//正确修改密码
    public void passwordTrue(){
    //点击忘记密码，校验url是否正确
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    logic.forget_logic.skipForget();
    //录入账号验证码
    logic.forget_logic.luru("13592280532","1234");
    //点击下一步
    logic.forget_logic.next();
    //重置密码
    logic.forget_logic.resetpwd("lmm123456","lmm123456");
    //重置成功查看页面是否跳转
    logic.forget_logic.succeed();
}



@Test
    public void passwordFalse(){
    //点击忘记密码，校验url是否正确
    logic.forget_logic.skipForget();
    //录入账号验证码
    logic.forget_logic.luru("13592280532","1234");
    //点击下一步
    logic.forget_logic.next();
    //重置密码
    logic.forget_logic.resetpwd("lmmlmm","123456");
    //校验错误提示是否出现
String text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[1]/div/div[2]")).getText();
MyAssert.assertEquals(text,"密码格式不对");
//点击登录返回登录页
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div[2]/button")).click();
    //关闭所有页面

}


}
