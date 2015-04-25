import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Iaroslav_Sviatkin on 4/24/2015.
 */
public class Test_b {

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("AfterMethod_b");
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("BeforeMethod_b");

    }

    @Test(groups = {"q","c"})
    public void testTest_a() throws Exception {
        System.out.println("Test_a");
    }

    @Test
    public void testTest_b() throws Exception {
        System.out.println("Test_b");
    }

    @Test(dependsOnGroups = "q")
    public void testTest_c() throws Exception {
        System.out.println("Test_c");

    }
}

