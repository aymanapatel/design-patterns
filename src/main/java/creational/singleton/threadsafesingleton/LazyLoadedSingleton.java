package creational.singleton.threadsafesingleton;

public class LazyLoadedSingleton {



    private static volatile LazyLoadedSingleton instance = null;


    // Prevent from Reflection-based changes
    private LazyLoadedSingleton(){
        if(instance!=null) {
            throw new RuntimeException("Reflection, you bad boy! Use getInstance() to create");
        }
    }

    public static LazyLoadedSingleton getInstance(){

        if(instance == null) {
            synchronized (LazyLoadedSingleton.class){ //
                if(instance == null) {
                    instance = new LazyLoadedSingleton();
                }
            }

        }
        return instance;
    }

}
