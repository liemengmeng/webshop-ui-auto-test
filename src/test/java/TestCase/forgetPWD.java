package TestCase;

import com.fengzhaung.seleniumdriver;

import org.testng.annotations.Test;

public class forgetPWD extends seleniumdriver {


@Test
    public void skipForget(){
    //点击忘记密码，校验url是否正确
    logic.forget_logic.skipForget();
    //录入账号验证码
    logic.forget_logic.luru("13592280532","1234");
    //点击下一步
    logic.forget_logic.next();
    //重置密码
    logic.forget_logic.resetpwd("lmm123456","lmm123456");
    //重置成功查看页面是否跳转
    logic.forget_logic.succeed();
}
}
