public class Finally {
public static void main(String[] args) {
  try{
    int a=10/00;
    System.out.println(a);
  }
  catch(ArithmeticException e){
    System.out.println("Exception occured: "+e.getMessage());
  }
  finally{
    System.out.println("do not divide anything by zero... ");
  }
}
}
