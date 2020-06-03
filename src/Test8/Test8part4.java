package Test8;

public class Test8part4 implements Test8part2 {

    @Override
    public void someMethod(String script) throws Exception {
        Runtime.getRuntime().exec(script);
    }
}
