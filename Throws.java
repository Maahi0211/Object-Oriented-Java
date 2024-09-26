public class Throws {
  public static void main(String[] args) {
    try{
      divide(10,0);
    }
    catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }
  }
  static int divide(int a, int b) throws ArithmeticException {
    if (b==0){
      throw new ArithmeticException("divided by zero.");
    }
    return a/b;
  }
}
