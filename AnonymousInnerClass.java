class A{
  public void show(){
    System.out.println("i am a very old person");
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    A obj = new A() {
      public void show(){
        System.out.println("i am not that old now....hehe");
      }
    };
    obj.show();
  }
}
