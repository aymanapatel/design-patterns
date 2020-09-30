package creational.singleton.staticsingleton;

public class LazyLoadedSingleton {



    private static LazyLoadedSingleton instance = null;

    private LazyLoadedSingleton(){}

    public static LazyLoadedSingleton getInstance(){

        if(instance == null) {
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }

}
