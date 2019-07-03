package TestCase;

import com.fengzhaung.seleniumdriver;
import logic.client_logic;
import org.testng.annotations.Test;

public class Client extends seleniumdriver{
    @Test
    public static void Client(){
        logic.login_logic.userlogin("13592280532","lmm123456");
        client_logic.baojia();
        client_logic.xunpan();
        client_logic.shangji();
        //退出登录
        logic.login_logic.out();

    }
}
