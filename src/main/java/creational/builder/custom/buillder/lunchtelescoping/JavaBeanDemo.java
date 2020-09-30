package creational.builder.custom.buillder.lunchtelescoping;

// Lunch Bean
// :) Immutable
// :( Adding constructor for each use
public class JavaBeanDemo {


    public static void main(String[] args) {

        JavaBean lunchOrderBean = new JavaBean("White", "Red", "Yes", "Yes");

/*        lunchOrderBean.setBread("White");
        lunchOrderBean.setJam("Red");
        lunchOrderBean.setCheese("Yes");
        lunchOrderBean.setLettuce("Yes");*/

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getJam());
        System.out.println(lunchOrderBean.getCheese());
        System.out.println(lunchOrderBean.getLettuce());

    }
}
