package behavioural.observer.custom;

public class TabletClient extends Observer{


    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from Tablet");

    }

    @Override
    void update() {
        System.out.println("Tablet stream:" + subject.getState());
    }
}
