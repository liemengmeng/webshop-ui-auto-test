package pages;

import org.openqa.selenium.By;

public class forgetPwd {
    //忘记密码跳转按钮
    public static By pwdBut = By.linkText("忘记登录密码？");
    public static By user = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[1]/div/div/input");
    //获取验证码按钮
    public static By butCode = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[2]/div/button/span");
    //验证码文本框
    public static By yanzheng = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[2]/div/div/input");
    //下一步
    public static By nextBut = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[3]/div/button/span");

    //重置密码页面
//新密码
    public static By newpwd1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[1]/div/div/input");
    public static By newpwd2= By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[2]/div/div/input");
    public static By affirmBut = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/form/div[3]/div/button");

    //重置成功
    //立即登录按钮
    public static By atonce = By.xpath("//*[@id=\"app\"]/div[1]/div/div[3]/div/button");
}