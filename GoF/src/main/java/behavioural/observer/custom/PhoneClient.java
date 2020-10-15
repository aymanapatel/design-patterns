package behavioural.observer.custom;

public class PhoneClient extends Observer{
    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from Phone");

    }

    @Override
    void update() {
        System.out.println("Phone stream:" + subject.getState());
    }
}
