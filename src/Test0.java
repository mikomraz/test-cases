public class Test0 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        Runtime.getRuntime().exec(script);
    }
}
