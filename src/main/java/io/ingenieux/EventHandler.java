package io.ingenieux;

import com.amazonaws.services.lambda.runtime.Context;

import java.io.IOException;

public class EventHandler {
    public void lambdaHandler(String input, Context context) throws IOException {
        context.getLogger().log(String.format("Hello, World! (args='%s')", input));
    }
}
