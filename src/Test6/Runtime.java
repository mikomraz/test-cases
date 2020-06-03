package Test6;

import java.io.IOException;

class Runtime {

    static Runtime singletonRuntime = new Runtime();
    
    public static Runtime getRuntime() {
        return singletonRuntime;
    }

    public Process exec(String command) throws IOException {
        System.out.println("nothing here");
        throw new IOException();
    }
}
