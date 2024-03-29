package logic;


import MyAssert.MyAssert;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;


import pages.releaseCasse;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class releaseCase_logic1 extends seleniumdriver {


    //该方法只适用于除照明工程之外的案例
    public static void case1(){

        //点击案例管理
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[3]/div/div/a")).click();
//点击发布案例
        com.fengzhaung.actions.clik(releaseCasse.release);
        //获取当前页面的句柄
 String handles1=driver.getWindowHandle();
//获得所有页面的句柄
        Set<String> handles=driver.getWindowHandles();
        for (String handle:handles) {
            if (handle.equals(handles1)) {
                continue;

            }else{
               driver.switchTo().window(handle);
             driver.findElement(releaseCasse.remould).click();
                driver.findElement(releaseCasse.kongtiao).click();
                driver.findElement(releaseCasse.affirm).click();
            }

        }
    }

    public static  void case2(String mingcheng){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(releaseCasse.casename).sendKeys(mingcheng);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击选择省
       driver.findElement(releaseCasse.sheng).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //选择省
       driver.findElement(releaseCasse.getsheng).click();
//点击选择市
       driver.findElement(releaseCasse.shi).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       driver.findElement(releaseCasse.getShi).click();
//选择区
        driver.findElement(releaseCasse.qu).click();
        driver.findElement(releaseCasse.getQu).click();




//上传图片
        driver.findElement(releaseCasse.liulan).click();
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(2000);
            robot.mouseMove(74, 162);
            robot.setAutoDelay(2000);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(2000);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(2000);
            robot.mouseMove(600, 164);
            robot.setAutoDelay(1000);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(2000);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(1000);
            robot.mouseMove(510, 313);
            robot.setAutoDelay(1000);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(1000);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(1000);

        }catch (AWTException e){

        }
        driver.findElement(releaseCasse.leimu1).click();
        driver.findElement(releaseCasse.leimu2).click();
       driver.findElement(releaseCasse.mingcheng2).sendKeys("案例名称");
       driver.findElement(releaseCasse.shuliang2).sendKeys("50");
       driver.findElement(releaseCasse.guige).sendKeys("30");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        //点击提交按钮
        com.fengzhaung.actions.clik(releaseCasse.tijiao);
    }

    public static void case3(){
   // driver.findElement(releaseCasse.fanhui).click();
    //获取当前页面的句柄
        String handles1=driver.getWindowHandle();
        //关闭当前页面
        seleniumdriver.close();
//获得所有页面的句柄
        Set<String> handles=driver.getWindowHandles();
        for (String handle:handles) {
            if (handle.equals(handles1)) {
                continue;

            }else{
                driver.switchTo().window(handle);

            }

        }

    }
    //管理案例

public static void  cases1(){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[3]/div/div/a")).click();
    //点击管理案例
driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/div/div[2]/span")).click();
    com.fengzhaung.actions.clik(releaseCasse.shenhezhong);
    driver.findElement(releaseCasse.xiangmu).sendKeys("案例名称");
    com.fengzhaung.actions.clik(releaseCasse.sousuo);
    boolean b=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div/div[3]/table/tbody/tr[1]/td[2]/div/div/div[2]/p[1]")).isDisplayed();
    MyAssert.assertTrue(b);
    com.fengzhaung.actions.clik(releaseCasse.qingkong);
    }
    //案例回收站
    public static void  cases2(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[3]/div/div/a")).click();
        com.fengzhaung.actions.clik(releaseCasse.huishou);
        boolean b=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/span[2]")).isDisplayed();
        MyAssert.assertTrue(b);
    }
    }



