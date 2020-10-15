package behavioural.observer.custom;

public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
