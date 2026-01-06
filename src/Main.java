import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(1);
        c.add(7);
        c.add(5);

        Set<String> fruits = new HashSet<>() ;
        fruits.add("banana") ;
        fruits.add("orange") ;
        fruits.add("avocado") ;
        fruits.add("banana") ;


        System.out.println("Our Set of fruits: " + fruits);

        System.out.println("Original (each *2):");
        Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value * 2);
        }
        List<Integer> list = new ArrayList<>(c);

        Collections.sort(list);
        System.out.println("\nSorted ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted descending: " + list);

        System.out.println("\n System Working well");



        Set<String> animals = new TreeSet<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Ant");
        animals.add("Cat"); // Duplicate ignored

        System.out.println("TreeSet: " + animals);

        animals.remove("Elephant");
        System.out.println("After removing Elephant: " + animals);
    }
}
