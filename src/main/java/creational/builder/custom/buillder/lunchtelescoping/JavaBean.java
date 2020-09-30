package creational.builder.custom.buillder.lunchtelescoping;


// Lunch Bean
public class JavaBean {


    private String bread;
    private String jam;
    private String cheese;
    private String lettuce;


    // Telescoping constructors
    public JavaBean(String bread) {
        this.bread = bread;
    }
    public JavaBean(String bread, String jam) {
        this(bread); // Calling line 15
        this.jam = jam;
    }
    public JavaBean(String bread, String jam, String cheese) {
        this(bread, jam); // Calling line 18
        this.cheese = cheese;
    }
    public JavaBean(String bread, String jam, String cheese, String lettuce) {
        this(bread, jam, cheese); // Calling line 22
        this.lettuce = lettuce;
    }


    public String getBread() {
        return bread;
    }

    public String getJam() {
        return jam;
    }

    public String getCheese() {
        return cheese;
    }

    public String getLettuce() {
        return lettuce;
    }
}
