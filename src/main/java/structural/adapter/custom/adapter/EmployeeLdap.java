package structural.adapter.custom.adapter;

public class EmployeeLdap {

    private String cn;
    private String surName;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surName, String givenName, String mail) {
        this.cn = cn;
        this.surName = surName;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
