package day43Annotations.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C3 {
    @Test
    void pqr()
    {
        System.out.println("This is abc from C1");
    }

    @BeforeSuite
    void bs()
    {
        System.out.println("This is BeforeSuite method");
    }

    @AfterSuite
    void as()
    {
        System.out.println("This is AfterSuite method");
    }
}
