package structural.adapter.api.arrays;

import java.awt.*;
import java.util.Arrays;


import java.util.List;

public class ArrayAsListMain {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[]{2,21,23};

        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);


    }
}
