package structural.adapter.custom.adapter;

import java.util.StringTokenizer;

public class EmployeeCsv {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCsv(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values,",");
        if(tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
