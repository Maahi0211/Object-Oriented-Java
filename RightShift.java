import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two mnumber: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a>>b;
        System.out.println(c);
    }
}
