package creational.builder.custom.buillder.bestbuilder;


// Builder pattern: Best of both worlds
public class JavaBean {

    public static class Builder {

        private String bread;
        private String jam;
        private String cheese;
        private String lettuce;

        public Builder() {

        }

        public JavaBean build() {
            return new JavaBean(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder jam(String jam){
            this.jam = jam;
            return this;
        }
        public Builder lettuce(String lettuce){
            this.lettuce = lettuce;
            return this;
        }
        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

    }

    private final String bread;
    private final String jam;
    private final String cheese;
    private final String lettuce;

    public JavaBean(Builder builder) {
        this.bread = builder.bread;
        this.jam = builder.jam;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
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
