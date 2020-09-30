package creational.singleton.staticsingleton;

public class EagerLoadedSingleton {



    private static EagerLoadedSingleton instance = new EagerLoadedSingleton();

    private EagerLoadedSingleton(){}

    public static EagerLoadedSingleton getInstance(){
        return instance;
    }

}
