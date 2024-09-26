public class Throw {
  public static void main(String[] args) {
    try{
      setAge(15);
    }
    catch(IllegalArgumentException e){
      System.out.println("Error: "+e.getMessage());
    }
  }

  static void setAge(int age){
    if(age < 18){
      throw new IllegalArgumentException("age must be atleast 18 years old");
    }
    System.out.println(age);
  }
}
