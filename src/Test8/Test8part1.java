package Test8;

public class Test8part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");

        Test8part2 i1 = computeSomeI(2);
        i1.someMethod(script);
    }

    static Test8part2 computeSomeI(int i) throws Exception {
		if (i==1) {
			return new Test8part3();
		}
		else if (i==2) {
			return new Test8part4();
		}
		else {
			throw new Exception();
		}
	}
}


	
