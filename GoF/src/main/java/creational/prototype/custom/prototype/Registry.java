package creational.prototype.custom.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {


    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public  Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;

    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Arrival");
        movie.setPrice(24.12);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumber("221");
        book.setPrice(819);
        book.setTitle("Story of your life");
        items.put("Book", book);

    }
}
