package Test5;

import java.util.ArrayList;
import java.util.List;

public class Test5part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");

		List<Test5part2> list = new ArrayList<>();
		list.add(new Test5part3());
		list.add(new Test5part4());
		list.get(1).someMethod(script);
    }

}


	
