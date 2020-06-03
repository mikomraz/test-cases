package Test3;

import java.io.IOException;

public class Test3part2 implements Runnable {

    private String script;

    public Test3part2(String script) {
        this.script = script;
    }

    @Override
    public void run() {
        try {
            Runtime.getRuntime().exec(this.script);
        } catch (IOException e) {}
    }
}
