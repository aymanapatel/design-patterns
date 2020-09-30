package creational.builder.custom.buillder.lunch;


public class JavaBeanDemo {


    public static void main(String[] args) {

        JavaBean lunchOrderBean = new JavaBean();

        lunchOrderBean.setBread("White");
        lunchOrderBean.setJam("Red");
        lunchOrderBean.setCheese("Yes");
        lunchOrderBean.setLettuce("Yes");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getJam());
        System.out.println(lunchOrderBean.getCheese());
        System.out.println(lunchOrderBean.getLettuce());

    }
}
