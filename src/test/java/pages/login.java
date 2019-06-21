package pages;

import org.openqa.selenium.By;

public class login {
    //账号密码登录
    public static By  loginName= By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[1]/div/div/input");
    public static By  passWord= By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[2]/div/div/input");
    //手机验证码登录
    public static By  tellogin=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/span[2]");
    public  static By tel=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[1]/div/div/input");
    public static By yanzheng=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[2]/div/div/input");
    public static By buttel=By.xpath("//*[@id=\"app\"]/button/span/span");


    //登录按钮
    public static By longinbut=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/button");
    //切换账号密码
    public static By userlogin=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/span[1]");
    //忘记密码页面跳转
    public static By pwdlink=By.linkText("忘记登录密码？");
    //登录成功退出登录按钮
    public static By out1=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/img");
    public static  By out2=By.linkText("退出");



}
