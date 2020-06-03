package Test7;

import Test7.Test7impl.*;

public class Test7part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        Test7part2.func(script);
    }
}
