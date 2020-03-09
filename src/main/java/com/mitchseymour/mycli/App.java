
package com.mitchseymour.mycli;

import java.util.concurrent.Callable;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
  name = "mycli",
  description = "Says hello",
  version = "hello 0.1.0",
  mixinStandardHelpOptions = true
)
public class App implements Callable<Integer> {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        System.out.println(getGreeting());
        return 0;
    }

    public String getGreeting() {
        return "Hello CLI :)";
    }
}
