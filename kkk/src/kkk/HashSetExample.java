package kkk;
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("alia");
        hs.add("kiran");
        hs.add("chimu");
        hs.add("alia"); 

        System.out.println("HashSet elements: " + hs);

        if (hs.contains("kiran")) {
            System.out.println("HashSet contains kiran");
        }

        hs.remove("chimu");

        Iterator<String> iterator = hs.iterator();
        System.out.println("HashSet elements (via Iterator):");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("Size of HashSet: " + hs.size());

        hs.clear();

        if (hs.isEmpty()) {
            System.out.println("HashSet is empty");
        }
    }
}

