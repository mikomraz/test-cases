package Test4;

public class Test4part4 implements Test4part2 {

    @Override
    public void someMethod(String script) throws Exception {
        Runtime.getRuntime().exec(script);
    }
}
