interface A{
  int add(int i);
}

public class Lambda{
  public static void main(String[] args) {
    A obj = (int i) -> {
      return i*i;
    };
    int a = obj.add(7);
    System.out.println(a);
  }
}