package creational.singleton.threadsafesingleton;

public class CustomSingletonMain {


    public static void main(String[] args) {

        LazyLoadedSingleton singletonRuntime = LazyLoadedSingleton.getInstance(); // This is singleton
        // or EagerLoadedSingleton
        System.out.println(singletonRuntime);

        LazyLoadedSingleton anotherInstance = LazyLoadedSingleton.getInstance();
        // or EagerLoadedSingleton
        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("Same Custom Singleton instance that too thread-safe :)");
        }

        /**
         * Output:
         * creational.singleton.staticsingleton.CustomSingleton@1540e19d
         * creational.singleton.staticsingleton.CustomSingleton@1540e19d
         * Same Custom Singleton instance :)
         */
    }

}
