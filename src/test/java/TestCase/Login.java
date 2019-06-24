package TestCase;
import com.fengzhaung.seleniumdriver;
import org.testng.annotations.Test;




public class Login extends seleniumdriver {

    @Test
    public void login1() {
        //账号密码登录
        logic.login_logic.userlogin("13592280532", "lmm123456");
        //退出登录
        logic.login_logic.out();

    }

    @Test
    public void login2() {
        //验证码密码登录
        logic.login_logic.tellogin("13592280532", "1234");
        //退出登录
        logic.login_logic.out();
    }

    @Test
    public void login3() {
        //错误账号登录
        logic.login_logic.userlogin("13592280536", "lmm1123456");
     //错误手机号验证码登录
        logic.login_logic.tellogin("13592280532", "1112");
    }
}
