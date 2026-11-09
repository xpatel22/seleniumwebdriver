package day43Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    void testTitle()
    {
        String act_title="Opencart";
        String exp_title="Openshot";

        /*if (act_title.equals(exp_title))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }*/

        Assert.assertEquals(act_title,exp_title);

    }
}
