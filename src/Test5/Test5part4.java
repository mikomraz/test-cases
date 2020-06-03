package Test5;

public class Test5part4 implements Test5part2 {

    @Override
    public void someMethod(String script) throws Exception {
        Runtime.getRuntime().exec(script);
    }
}
