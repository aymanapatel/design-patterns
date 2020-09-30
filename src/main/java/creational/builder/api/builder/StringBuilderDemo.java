package creational.builder.api.builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("Hello");
        stringBuilder.append(" Ayman ");
        stringBuilder.append(1997);

        System.out.println(stringBuilder);
    }
}
