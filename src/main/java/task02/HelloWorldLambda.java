package task02;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Map;

public class HelloWorldLambda {

    public String myHandler()
    {
        //LambdaLogger logger = context.getLogger();
        //logger.log("received : " + input);
        return "Hello from Lambda";
    }
}
