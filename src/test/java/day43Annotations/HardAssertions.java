package day43Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test(priority = 1)
    void test1()
    {
        Assert.assertEquals("xyz","xyz");
    }

    @Test(priority = 2)
    void test2()
    {
        Assert.assertEquals("xyz","xyzs");
    }

    @Test(priority = 3)
    void test3()
    {
        Assert.assertNotEquals(123,456);
    }
    @Test(priority = 4)
    void test4()
    {
        Assert.assertNotEquals(123,123);
    }

    @Test(priority = 5)
    void test5()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 6)
    void test6()
    {
        Assert.assertTrue(false);
    }

    @Test(priority = 7)
    void test7()
    {
        Assert.fail();
    }
}
