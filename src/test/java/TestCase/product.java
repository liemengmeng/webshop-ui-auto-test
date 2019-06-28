package TestCase;

import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class product extends seleniumdriver {
@Test
    public static void show(){
    seleniumdriver.open("chrome");
    driver.get("http://192.168.100.17/#/Login");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[1]/div/div/input")).sendKeys("13592280532");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/div[2]/div/div/input")).sendKeys("lmm123456");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/button/span")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/div/a")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}