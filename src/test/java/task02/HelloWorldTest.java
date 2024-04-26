package task02;

import org.junit.Test;

public class HelloWorldTest {


    @Test
    public void test() {
        HelloWorldLambda lambda = new HelloWorldLambda();

        System.out.println("Return Val = " + String.valueOf(10));
        System.out.println("Return Val = " + ("V=" + 10));
        System.out.println(lambda.myHandler());
        //fail("Not yet implemented");
    }
}
