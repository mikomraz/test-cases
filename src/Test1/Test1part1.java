package Test1;

public class Test1part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        Test1part2.func(script);
    }
}
