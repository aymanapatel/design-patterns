package creational.factory.custom.factory;


public class Main {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println("Blog get Pages" + site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.ECOMMERCE);

        System.out.println("Ecommerce get Pages" + site.getPages());

    }
}
