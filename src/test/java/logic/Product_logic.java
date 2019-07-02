package logic;


import MyAssert.MyAssert;
import TestCase.Login;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.product;
import tools.MyFile;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;


public class Product_logic extends seleniumdriver {
//发布产品
    public static void release1() {
        //点击产品管理
        com.fengzhaung.actions.clik(product.productLink);
        //点击发布产品
        com.fengzhaung.actions.clik(product.releaseProduct);
        //获取当前页面句柄
        String  handles1=driver.getWindowHandle();
        //获取所有页面句柄
        Set<String> handles=driver.getWindowHandles();
        //循环句柄
        for (String handle:handles){
            if (handle.equals(handles1)){
                continue;
            }else{
                //切换到发布产品句柄
                driver.switchTo().window(handle);
                com.fengzhaung.actions.clik(product.sheng);
                com.fengzhaung.actions.clik(product.getsheng);
                com.fengzhaung.actions.clik(product.shi);
                com.fengzhaung.actions.clik(product.getShi);
                //收起窗口
                com.fengzhaung.actions.clik(product.shi);
                //点击选择应用场景
                com.fengzhaung.actions.clik(product.changjing);
                //点击选择类目
                com.fengzhaung.actions.clik(product.leimu);
                com.fengzhaung.actions.clik(product.getleimu);
                com.fengzhaung.actions.clik(product.confirm);
                driver.findElement(product.mingcheng).sendKeys("产品名称");
                driver.findElement(product.ci).sendKeys("照明");
                driver.findElement(product.guangtongliang).sendKeys("200");
                driver.findElement(product.guangxiao).sendKeys("50");
                driver.findElement(product.xianse).sendKeys("100");
                driver.findElement(product.shouming).sendKeys("3年");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                com.fengzhaung.actions.clik(product.tiaoguang1);
                com.fengzhaung.actions.clik(product.tiaoguang2);
                com.fengzhaung.actions.clik(product.fanghu1);
                com.fengzhaung.actions.clik(product.fanghu2);
                driver.findElement(product.chicun).sendKeys("20");
                com.fengzhaung.actions.clik(product.renzheng);
                com.fengzhaung.actions.clik(product.cailiao1);
                com.fengzhaung.actions.clik(product.cailiao2);
                driver.findElement(product.dianya).sendKeys("500");
                driver.findElement(product.sewen).sendKeys("300");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                com.fengzhaung.actions.clik(product.danwei1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                com.fengzhaung.actions.clik(product.danwei2);
                driver.findElement(product.dingliang).sendKeys("20");
                driver.findElement(product.jiage).sendKeys("50");
                //上传图片
                driver.findElement(product.liulan).click();
                try {
                    Robot robot = new Robot();
                    robot.setAutoDelay(2000);
                    robot.mouseMove(81, 220);
                    robot.setAutoDelay(2000);
                    robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(2000);
                    robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(2000);
                    robot.mouseMove(589, 170);
                    robot.setAutoDelay(1000);
                    robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(2000);
                    robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(1000);
                    robot.mouseMove(506, 339);
                    robot.setAutoDelay(1000);
                    robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(1000);
                    robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
                    robot.setAutoDelay(1000);

                }catch (AWTException e){

                }
com.fengzhaung.actions.clik(product.tijiao);
                //关闭当前页面
                seleniumdriver.close();
                //切换句柄
                driver.switchTo().window(handles1);
            }
        }
    }

//管理产品
    public static void QMAN(){
        com.fengzhaung.actions.clik( product.productLink);
        com.fengzhaung.actions.clik(product.Linkchanpin);
        driver.findElement(product.Getmingcheng).sendKeys("产品名称");
        com.fengzhaung.actions.clik(product.caogao);
        com.fengzhaung.actions.clik(product.quanbu);
    com.fengzhaung.actions.clik(product.sousuo);
  Boolean b=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div/div[3]/table/tbody/tr[1]/td[2]/div/div/div[2]/p[1]")).isDisplayed();
  //判断该元素是否存在
   MyAssert.assertTrue(b);
   com.fengzhaung.actions.clik(product.qingkong);
    driver.findElement(product.Getmingcheng).sendKeys("产品名称");
    com.fengzhaung.actions.clik(product.caogao);
    }

//产品回收站

    public static void recycle(){
        com.fengzhaung.actions.clik( product.productLink);
        com.fengzhaung.actions.clik(product.recycleLink);
        Boolean a=driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/span")).isDisplayed();
        MyAssert.assertTrue(a);
    }

}