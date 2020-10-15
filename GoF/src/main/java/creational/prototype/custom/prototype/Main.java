package creational.prototype.custom.prototype;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Blade Runner");

        System.out.println(movie); // creational.prototype.prototypecustom.Movie@1540e19d
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());


        Movie movie2 = (Movie) registry.createItem("Movie");
        movie2.setTitle("Dune");

        System.out.println(movie2);
        System.out.println(movie2.getRuntime()); // creational.prototype.prototypecustom.Movie@677327b6
        System.out.println(movie2.getTitle());
        System.out.println(movie2.getUrl());

        /**
         * Deep copy: movie and movie2 gives different object reference
         *
         */

    }
}
