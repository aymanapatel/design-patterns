package behavioural.observer.library;

import java.util.Observable;
import java.util.Observer;

public class ObserverMain {

    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Ayman");
        Client client2 = new Client("Chinmay");

        /** Output is LIFO
         * Update Chinmay's stream, someone tweeted something
         * Update Ayman's stream, someone tweeted something
         */


        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}

// Concrete Subject
class TwitterStream extends Observable {

    public void someoneTweeted(){
        setChanged();
        notifyObservers();
    }
}


// Concrete observer
//
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something");
    }
}