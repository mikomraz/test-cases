package Test4;

public class Test4part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");

        Test4part2 i1 = computeSomeI(2);
        i1.someMethod(script);
    }

    static Test4part2 computeSomeI(int i) throws Exception {
		if (i==1) {
			return new Test4part3();
		}
		else if (i==2) {
			return new Test4part4();
		}
		else {
			throw new Exception();
		}
	}
}


	
