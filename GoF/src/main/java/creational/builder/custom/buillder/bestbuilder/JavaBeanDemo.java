package creational.builder.custom.buillder.bestbuilder;


public class JavaBeanDemo {


    public static void main(String[] args) {

        JavaBean.Builder builder = new JavaBean.Builder();
        builder.bread("White").jam("Red").cheese("Yes").lettuce("Yes");

        JavaBean lunchOrderBean = builder.build();

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getJam());
        System.out.println(lunchOrderBean.getCheese());
        System.out.println(lunchOrderBean.getLettuce());

    }
}
