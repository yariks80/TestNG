package ThreadTest;

import org.testng.annotations.Test;

/**
 * Created by Iaroslav_Sviatkin on 4/24/2015.
 */
public class TestThread {

    @Test(threadPoolSize = 5,invocationCount = 20,invocationTimeOut = 10000)
    public void testThread() throws Exception {

        System.out.println("Thead"+Thread.currentThread().getId());


    }
}
