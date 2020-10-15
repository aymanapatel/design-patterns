package creational.factory.custom.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch(siteType) {
            case BLOG : {
                return new Blog();
            }

            case ECOMMERCE : {
                return new Ecommerce();
            }

            default : {
                return null;
            }
        }
    }
}
