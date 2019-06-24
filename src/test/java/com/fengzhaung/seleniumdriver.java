package com.fengzhaung;

import log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumdriver {
 public static  WebDriver driver;
    static final LoggerControler log = LoggerControler.getLogger( seleniumdriver.class);

    public  static void open(String name){
        if (name.equals("chrome")){

driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");


        }else{
log.error("浏览器输入有误");
        }
    }

}
