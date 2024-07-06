package kkk;

class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 public void makeSound() {
     System.out.println("bho bho");
 }
}

class Cat extends Animal {
 public void makeSound() {
     System.out.println("meo meo");
 }
}

public class k {
 public static void main(String[] args) {
     Animal dog = new Dog(); 
     Animal cat = new Cat(); 

     dog.makeSound(); 
     cat.makeSound(); 
 }
}

