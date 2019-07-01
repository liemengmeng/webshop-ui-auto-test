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

    //第二步，发布产品页面
    //产品名称
    public static By mingcheng=By.xpath("//*[@id=\"productTitle\"]");
    //产品关键词
    public static By ci=By.xpath("//*[@id=\"struct-productKeywords\"]/div/div[2]/div[1]/div[1]/div/ul/li/span/input");
    //光通量
    public static By guangtongliang=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div[1]/span/input");
    //光效
    public static By  guangxiao=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div[1]/span/input");
    //显示指数
    public static By xianse=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[5]/div[2]/div/div[1]/span/input");
    //寿命

    public static By shouming=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[6]/div[2]/div/div[1]/span/input");
    //展开下拉框调光
    public static By tiaoguang1 =By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[7]/div[2]/div/div[1]/div/input");

    //选择调光（可以）
    public static By tiaoguang2 =By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span");
    //防护等级下拉框
    public static By fanghu1=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[8]/div[2]/div/div[1]/div/input");
    //防护等级选择
    public static By fanghu2=By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[5]/span");
    //尺寸
    public static By chicun =By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[9]/div[2]/div/div[1]/span/input");
    //认证(德国GS认证)
    public static By renzheng =By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[10]/div[2]/div/div[1]/label[1]/span[1]/span");
    //外壳材料展开下拉框
    public static By cailiao1=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[11]/div[2]/div/div[1]/div[1]/input");
    //具体材料
    public static By cailiao2=By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]/span");
    //输出电压
    public  static By dianya=By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[12]/div[2]/div/div/div/ul/li/span/input");
    //色温
    public static By sewen =By.xpath("//*[@id=\"struct-icbuCatProp\"]/div/div[2]/div[1]/div[2]/div/div/div[13]/div[2]/div/div/div/ul/li/span/input");
    //计量单位展开下拉框
    public static By danwei1=By.xpath("//*[@id=\"struct-priceUnit\"]/div/div[2]/div[1]/div[1]/input");
    //选择计量单位（盏）
    public static By danwei2=By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li[1]/span");
    //最小起订量
    public static By dingliang=By.xpath("//*[@id=\"struct-ladderPrice\"]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/div[3]/table/tbody/tr/td[1]/div/span[2]/input");
    //价格
    public static By jiage=By.xpath("//*[@id=\"struct-ladderPrice\"]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/div[3]/table/tbody/tr/td[2]/div/span[2]/input");
    //浏览图片
    public static By liulan =By.xpath("//*[@id=\"struct-scImages\"]/div/div[2]/div[1]/div/div/div/div[1]/input");
    //提交按钮
     public static By tijiao=By.xpath("//*[@id=\"struct-buttons\"]/button[3]");


}
