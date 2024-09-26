public class TryWithMultipleCatch {
  public static void main(String[] args) {
    try {

      int []arr = new int[5];
      System.out.println(arr[5]);

      int a=10/0;
      System.out.println(a);

    }

    catch(ArithmeticException e){
      System.out.println("cannot divide by zero. "+e.getMessage());
    }

    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("array size is from 0 to 4. "+e.getMessage());
    }

    catch(Exception e){
      System.out.println("Something went wrong."+e.getMessage());
    }
  }
}
