package logic;


import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.product;


import java.util.Set;


public class Product_logic extends seleniumdriver {
@Test
    public static void release1() {
        seleniumdriver.open("chrome");
        driver.get("http://192.168.100.17/#/Login");
        login_logic.userlogin("13592280532", "lmm123456");
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

            }
        }
    }

}