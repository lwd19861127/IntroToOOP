package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // creating an Empty ArrayList
        // <Type> : generic
        ArrayList<String> countries = new ArrayList<String>();

        // 1.add(obj) : add the obj at the end of the list
        countries.add("Canada");
        countries.add("USA");
        countries.add("China");
        countries.add("Brazil");
        countries.add("Japan");
        countries.add("South Korea");
        countries.add("Mexico");
        countries.add("Iran");
        countries.add("Philippines");

        // 2.size() : get the length of the list (count)
        System.out.println(countries.size());

        // 3.print the arrayList
        System.out.println(countries);

        // 4.add(i, obj) : add the obj at index i
        countries.add(0,"France");
        System.out.println(countries);

        // 5.get(i) : get the obj at index i
        System.out.println(countries.get(0));

        // 6.set(i, obj) : set the obj at index i to newObj
        //               : and returns the old obj
        System.out.println(countries.set(0, "New Zealand"));

        // 7.remove(obj) : remove the obj form the list
        //               : and returns whether the obj was removed or not (boolean)
        System.out.println(countries.remove("New Zealand"));

        // 8.remove(i) : remove the obj at index i from the list
        //             : expensive!
        //             : We have to create an new list to copy all elements
        countries.remove(0);

        // 9.contains(obj) : check if the obj is in the list. (boolean)
        countries.contains("Canada");

        // 10.clear() : clears the list. (remove all objects)
        countries.clear();

        // asList() returns 'List' type
        // List (interface) -> ArrayList (class, implementation)
        List<String> foodList = Arrays.asList("Hot pot", "Sushi", "Taco");
        // We need to create an new ArrayList object with the list.
        ArrayList<String> foodArrayList = new ArrayList<String>(foodList);
        System.out.println(foodArrayList.size());
        foodArrayList.add("Poutine");
        System.out.println(foodArrayList.get(foodArrayList.size() - 1));
    }
}
