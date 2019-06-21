package com.fengzhaung;

import log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/*
二次封装selenium打开浏览器关闭浏览器方法
 */
public class seleniumdriver {
    final static LoggerControler log=LoggerControler.getLogger(seleniumdriver.class);
    public static WebDriver driver;
    //开启浏览器方法
    public static WebDriver open(String browser) {

        //获取当前driver相对路径根据运行进行改变。
        String path=System.getProperty("user.dri");
        if (browser.equals("chrome")){
            driver=new ChromeDriver();
//设置路径
            System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver.exe");
        }else if(browser.equals("ie")){
            driver=new InternetExplorerDriver();
//没下载，下载后可以加上地址。
        }else if (browser.equals("firefox")){
            driver=new FirefoxDriver();
            System.setProperty("webdriver.firefox.driver",path+"/drivers/geckodriver.exe");

        }else{
System.out.println("你输入的浏览器有误");
        }
        return  driver;
    }
    //关闭浏览器方法
    public static void closeAll(){
        driver.quit();
        log.info("关闭浏览器");
    }
    public static void close(){
        driver.close();
        log.info("关闭所有相关内容，释放资源");
    }
}
