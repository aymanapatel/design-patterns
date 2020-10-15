package creational.factory.custom.factory;

public class Ecommerce extends Website{
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
