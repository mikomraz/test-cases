package Test6;

public class Test6 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        Runtime.getRuntime().exec(script);
    }
}
