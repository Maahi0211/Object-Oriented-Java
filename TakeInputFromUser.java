import java.util.Scanner;

public class TakeInputFromUser{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a String: ");
    String st=sc.nextLine();

    System.out.println("Enter an Integer: ");
    int num=sc.nextInt();

    System.out.println(st + num);

    sc.close();
  }
}