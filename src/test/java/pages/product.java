package pages;

import org.openqa.selenium.By;

public class product {
    //产品管理
    public static By productLink= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div/div/a");
    //发布产品
    public static By  releaseProduct=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/div/div[1]/span");
    //选择地区
    public static By sheng=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/div/div[1]/div/input");
    //地位到具体省(河北)
    public static By getsheng=By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[4]/span");
    //选择市
    public static By shi=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div/div/div[2]/div[2]/span/span/i");
    //选择具体市
    public static By getShi=By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]");
    //选择应用场景(建筑外观)
    public static By changjing=By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div/label[5]/span[1]");
    //选择类目（LED驱动与控制）
    public static By leimu=By.xpath("//*[@id=\"app\"]/div[2]/div[4]/div/div[2]/div/div/ul/li[1]");
    //具体类目
    public static By getleimu=By.xpath("//*[@id=\"app\"]/div[2]/div[4]/div/div[2]/div/div[2]/ul/li[1]");
//确定类目，发布产品
    public static By confirm=By.xpath("//*[@id=\"app\"]/div[2]/button/span");

}
