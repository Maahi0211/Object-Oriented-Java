class A{
  int age;
  public void show(){
    System.out.println("i am an old lady");
  }
  class B{
    public void disco(){
      System.out.println("its the time to disco");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.show();

    A.B obj1 = obj.new B();
    obj1.disco();
  }
}
