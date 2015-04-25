package Priority;

import org.testng.annotations.*;

/**
 * Created by Iaroslav_Sviatkin on 4/24/2015.
 */
public class Test_priority {
    @BeforeClass
    public void classUp() throws Exception {
        System.out.println("BeforeClass_p");

    }
    @AfterClass
    public void AfterDawn() throws Exception {
        System.out.println("AfterClass_p");

    }
    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("AfterMethod_p");


    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("BeforeMethod_p");

    }

    @Test(description ="TEST P_p",priority = 2)
    public void testTest_a() throws Exception {
        System.out.println("Test_a");
    }

    @Test (description ="TEST P_b", priority = 1)
    public void testTest_b() throws Exception {

        System.out.println("Test_b");
    }

    @Test (description ="TEST P_c", priority = 0)
    public void testTest_c() throws Exception {

        System.out.println("Test_c");
    }
}
