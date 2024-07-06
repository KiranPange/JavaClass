package kkk;

import java.util.ArrayList; // Import the ArrayList class

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(10);
        al.add(15);

        al.add(1, 8); 

        System.out.println("Element at index 2: " + al.get(2));

   System.out.println("Elements in the ArrayList:");
        
   
   for (int number : al) {
            System.out.println(number);
        }

        System.out.println("Size of ArrayList: " + al.size());

        if (al.contains(10)) {
            System.out.println("ArrayList contains 10");
        }

            al.remove(Integer.valueOf(5)); 

        al.clear();

        if (al.isEmpty()) {
            System.out.println("ArrayList is empty");
        }
    }
}


