package TestCase;

import com.fengzhaung.seleniumdriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class openURL  extends  seleniumdriver{

    @BeforeSuite
    public static  void open(){
seleniumdriver.open("chrome");
driver.get("http://192.168.100.17/#/Login");
    }

    @AfterSuite
    public static void closeAll(){
        seleniumdriver.closeAll();
    }
}
