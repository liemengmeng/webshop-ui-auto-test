package TestCase;

import com.fengzhaung.seleniumdriver;

import logic.Product_logic;

import org.testng.annotations.Test;


public class product extends seleniumdriver {
//发布产品

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
//产品列表
@Test
  public static void product2(){
  //登录账号
  logic.login_logic.userlogin("13592280532","lmm123456");
  Product_logic.QMAN();
}
//产品回收站
  @Test
  public static void product3(){

    Product_logic.recycle();
    //退出登录
    logic.login_logic.out();
  }
}