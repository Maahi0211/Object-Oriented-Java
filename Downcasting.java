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
public class Downcasting {
  public static void main(String[] args) {
      Animal animal = new Dog();  // Upcasting
      Dog dog = (Dog) animal;  // Downcasting back to Dog
      dog.sound();  // Calls the Dog's sound method
  }
}
