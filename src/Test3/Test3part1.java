package Test3;

public class Test3part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        Runnable myRunnable = new Test3part2(script);
        Thread t = new Thread(myRunnable);
        t.run();
        t.join();
    }
}
