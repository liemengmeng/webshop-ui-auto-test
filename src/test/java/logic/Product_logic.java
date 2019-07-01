package logic;


import com.fengzhaung.seleniumdriver;
import pages.product;



import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;


public class Product_logic extends seleniumdriver {

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




}