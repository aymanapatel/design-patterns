package behavioural.observer.custom;

public class ObserverMain {


    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Message 1");
        tabletClient.addMessage("Message 2");
    }
}
