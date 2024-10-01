class Animal {
  void sound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  void sound() {
      System.out.println("Dog barks");
  }
}

public class Upcasting {
  public static void main(String[] args) {
      Dog dog = new Dog();  // Dog object
      Animal animal = dog;  // Upcasting (Dog to Animal)
      animal.sound();  // Calls the Dog's sound method due to runtime polymorphism
  }
}
