package pages;

import org.openqa.selenium.By;

public class client {
    //商机&案例中心菜单
    public static By clients= By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[4]/div/div/a");
    //报价管理
    public static By baojia=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/span");
    //(报价管理)查看详情
    public  static By chakan=By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[1]/div/div[3]/table/tbody/tr[1]/td[4]/div/div/div/div/button[1]/span");
    //返回列表（报价管理）
    public static  By fanhui1=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/h2");
    //商机市场
     public static By shangji=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/span");
     //询盘
    public static By xunpan=By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div[1]/span");
    //查看详情（询盘）
    public static By xiangqing=By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div/div[3]/table/tbody/tr/td[6]/div/span");
    //返回按钮（询盘）
    public static By fanhui2=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[1]/button/span");
}
