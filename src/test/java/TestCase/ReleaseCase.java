package TestCase;

import com.fengzhaung.seleniumdriver;
import logic.releaseCase_logic1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReleaseCase  extends seleniumdriver {

@Test
//发布案例
    public void cases1(){
    //登录账号

        logic.login_logic.userlogin("13592280532","lmm123456");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    releaseCase_logic1.case1();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    releaseCase_logic1.case2("案例名称");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    releaseCase_logic1.case3();
    //退出登录
    logic.login_logic.out();
    }

    @Test
    public void cases2() {
        //登录账号

        logic.login_logic.userlogin("13592280532", "lmm123456");
        releaseCase_logic1.cases1();

    }
    @Test
    public void cases3() {

        releaseCase_logic1.cases2();
        //退出登录
        logic.login_logic.out();
    }
}
