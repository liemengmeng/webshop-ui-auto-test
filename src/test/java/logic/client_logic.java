package logic;

import MyAssert.MyAssert;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;
import pages.client;

public class client_logic  extends seleniumdriver {

    public static void baojia(){
com.fengzhaung.actions.clik(client.clients);
        com.fengzhaung.actions.clik(client.baojia);
        com.fengzhaung.actions.clik(client.chakan);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(client.fanhui1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void  xunpan(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(client.clients);
        com.fengzhaung.actions.clik(client.xunpan);
        com.fengzhaung.actions.clik(client.xiangqing);
        com.fengzhaung.actions.clik(client.fanhui2);
    }

    public static void  shangji(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(client.clients);
        com.fengzhaung.actions.clik(client.shangji);
       Boolean b=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[1]/span")).isDisplayed();
       MyAssert.assertTrue(b);
       //浏览器后退
       driver.navigate().back();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
