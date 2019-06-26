package TestCase;

import com.fengzhaung.seleniumdriver;
import logic.releaseCase_logic1;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReleaseCase  extends seleniumdriver {
    @BeforeSuite
    public static  void open(){
        seleniumdriver.open("chrome");
        driver.get("http://192.168.100.17/#/Login");
    }
@Test
    public void cases(){
    //登录账号
        logic.login_logic.userlogin("13592280532","lmm123456");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    releaseCase_logic1.case1();
    releaseCase_logic1.case2("案例名称");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    releaseCase_logic1.case3();

    }

}