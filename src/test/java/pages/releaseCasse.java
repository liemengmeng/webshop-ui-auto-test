package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class releaseCasse {
    //案例管理
    public static By ceselink=  By.linkText("案例管理");
    //发布案例
    public static By release=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/div/div[1]/span");
    //发布案例第一步
    //选择改造类
    public static By remould=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/label[2]/span[2]");
    //选择空调工程
    public static By kongtiao =By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div/label[2]/span[1]/span");
    //确认类目发布案例
    public  static By affirm=By.xpath("//*[@id=\"app\"]/div[2]/button/span");
    //发布案例第二步
    //项目名称
    public static By casename=By.xpath("//*[@id=\"productTitle\"]");
    //选省文本框
    public static By sheng=By.xpath("//*[@id=\"struct-productKeywords\"]/div/div[2]/div[1]/div[1]/div[1]/input");
    //定位到具体省
    public static By getsheng=By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[12]");


    //选择市文本框
    public static By shi=By.xpath("//*[@id=\"struct-productKeywords\"]/div/div[2]/div[1]/div[2]/div/input");

    //定位到具体市
    public static  By getShi=By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[3]");

    //选择区文本框
    public static By qu=By.xpath("//*[@id=\"struct-productKeywords\"]/div/div[2]/div[1]/div[3]/div/input");
    public static By  getQu=By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[4]");



    //案例图片浏览按钮
    public static By liulan=By.xpath("//*[@id=\"struct-scImages\"]/div/div[2]/div[1]/div/div/div/div[1]/input");

    //选用灯具产品信息
    public static By mingcheng=By.xpath("//*[@id=\"struct-ladderPrice\"]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[3]/table/tbody/tr/td[1]/div/span[1]/input");
    public static By gonglv=By.xpath("//*[@id=\"struct-ladderPrice\"]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[3]/table/tbody/tr/td[2]/div/span[1]/input");
    public static By shuliang=By.xpath("//*[@id=\"struct-ladderPrice\"]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[3]/table/tbody/tr/td[3]/div/span[1]/input");


    //提交按钮
    public static By tijiao=By.xpath("//*[@id=\"struct-buttons\"]/button[3]");
    //发布案例第三步
    //继续发布按钮
    public  static By jixu=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/button[2]/span");
    public static By fanhui=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/button[1]/span");

}
