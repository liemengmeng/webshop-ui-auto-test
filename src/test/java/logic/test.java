package logic;

import org.testng.annotations.*;

public class test {
    @BeforeClass
    public void show1(){
        System.out.println("BeforeClass");
    }
    @Test(groups = "groups1")
    public void show4(){
        System.out.println("test1");
    }
    @Test(groups = "groups1")
    public void show9(){
        System.out.println("test2");
    }
    @AfterClass
    public void show3(){
        System.out.println("AfterClass");
    }
    @BeforeGroups("groups1")
    public void show5(){
        System.out.println("BeforeGroups1");
    }
    @AfterGroups("groups1")
    public void show6(){
        System.out.println("AfterGroups1");
    }


}
