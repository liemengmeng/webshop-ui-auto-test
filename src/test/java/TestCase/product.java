package TestCase;

import com.fengzhaung.seleniumdriver;

import logic.Product_logic;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class product extends seleniumdriver {


  @Test
  public static void product1(){
  //登录账号
  logic.login_logic.userlogin("13592280532","lmm123456");
  try {
    Thread.sleep(2000);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
    Product_logic.release1();
  //退出登录
  logic.login_logic.out();
}



}