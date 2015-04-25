import org.testng.annotations.*;

/**
 * Created by Iaroslav_Sviatkin on 4/24/2015.
 */
public class Test_a {
    @BeforeClass
    public void classUp() throws Exception {
        System.out.println("BeforeClass_a");

    }
    @AfterClass
    public void AfterDawn() throws Exception {
        System.out.println("AfterClass_a");

    }
    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("AfterMethod_a");
        

    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("BeforeMethod_a");

    }

    @Test (description ="TEST A_a", dependsOnMethods ={"testTest_b","testTest_c"}, alwaysRun = true)
    public void testTest_a() throws Exception {
        System.out.println("Test_a");
    }

    @Test (description ="TEST A_b" )
    public void testTest_b() throws Exception {

        System.out.println("Test_b");
    }

    @Test (description ="TEST A_c" )
    public void testTest_c() throws Exception {

        System.out.println("Test_c");
    }
}
