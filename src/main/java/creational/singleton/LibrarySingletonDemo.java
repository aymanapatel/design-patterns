package creational.singleton;

public class LibrarySingletonDemo {


    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime(); // This is singleton

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("Same instance :)");
        }

        /**
         * java.lang.Runtime@1540e19d
         * java.lang.Runtime@1540e19d
         * Same instance :)
         */

    }
}
