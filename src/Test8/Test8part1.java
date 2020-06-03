package Test8;

public class Test8part1 {
    public static void main(String[] args) throws Exception {
        String script = System.getenv("SCRIPTNAME");
        functionCreatingVulnerableContext(script);
    }

	private static void functionCreatingNotVulnerableContext(String script) throws Exception {
		Test8part2 v = new Test8part3();
		functionCallingVulnDependingOnContext(script, v);
	}

	private static void functionCreatingVulnerableContext(String script) throws Exception {
		Test8part2 v = new Test8part4();
		functionCallingVulnDependingOnContext(script, v);

	}

	private static void functionCallingVulnDependingOnContext(String script, Test8part2 v) throws Exception {
    	v.someMethod(script);
	}
}


	
