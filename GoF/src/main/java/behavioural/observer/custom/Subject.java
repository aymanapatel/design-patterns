package behavioural.observer.custom;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{


    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    // Add observers to List of Observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Remove observers to List of Observer
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for ( Observer observer : observers) {
            observer.update();
        }
    }
}
