import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Apple");

        System.out.println("Initial Set: " + fruits);


        System.out.println("Observation: Duplicate elements are NOT allowed in a HashSet.\n");

        System.out.println("Set size: " + fruits.size());

        System.out.println("Is the set empty? " + fruits.isEmpty());

        System.out.println("Does the set contain 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Does the set contain 'Mango'? " + fruits.contains("Mango") + "\n");

        fruits.add("Mango");
        fruits.remove("Grape");

        System.out.println("Updated Set after adding Mango and removing Grape: " + fruits);
        System.out.println("Updated size: " + fruits.size() + "\n");

    
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();


        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nObservation: Both methods work similarly, but Iterator is useful when removing elements during iteration.\n");

       
        HashSet<String> fruits2 = new HashSet<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Cherry");
        fruits2.add("Date");

        System.out.println("Second Set: " + fruits2);
        
        Set<String> common = new HashSet<>(fruits);
        common.retainAll(fruits2);

        System.out.println("Common elements: " + common);

        Set<String> uniqueToFirst = new HashSet<>(fruits);
        uniqueToFirst.removeAll(fruits2);

        System.out.println("Elements unique to first set: " + uniqueToFirst);

    
        Set<String> uniqueToSecond = new HashSet<>(fruits2);
        uniqueToSecond.removeAll(fruits);

        System.out.println("Elements unique to second set: " + uniqueToSecond);
    }
}