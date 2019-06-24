package TestCase;
import com.fengzhaung.seleniumdriver;
import org.testng.annotations.Test;


public class Login extends seleniumdriver {
    @Test
    public void login1(){
        logic.login_logic.userlogin( "13592280532","lmm123456");
    }

}
