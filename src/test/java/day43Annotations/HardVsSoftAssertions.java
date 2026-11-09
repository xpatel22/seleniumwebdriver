package day43Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
    @Test(priority=1)
    void test_hardassertions()
    {
        System.out.println("testing1...");
        System.out.println("testing2...");

        Assert.assertEquals(1,2);

        //remaining statements will not execute
        System.out.println("testing3...");
        System.out.println("testing4...");

    }

    @Test(priority = 2)
    void test_softassertions()
    {
        System.out.println("testing1...");
        System.out.println("testing2...");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1,2);

        //remaining statements will execute
        System.out.println("testing3...");
        System.out.println("testing4...");

        sa.assertAll(); //mandatory

    }
}
