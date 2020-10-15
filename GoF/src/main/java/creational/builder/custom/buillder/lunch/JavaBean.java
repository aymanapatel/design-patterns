package creational.builder.custom.buillder.lunch;


// Lunch Bean
// :( No immutability
// :) No need to add constructor for each use
public class JavaBean {


    private String bread;
    private String jam;
    private String cheese;
    private String lettuce;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }
}
