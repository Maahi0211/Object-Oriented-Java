enum Status{
  Running,
  Failed,
  Pending,
  Successful;
}

public class Enumeration {
  public static void main(String[] args) {
    Status s=Status.Successful;
    System.out.println(s);
    System.out.println(s.ordinal());
  }
}
