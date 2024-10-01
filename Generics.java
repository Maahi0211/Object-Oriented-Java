class Generics<T>{
  private T data;

  public Generics(T data){
    this.data=data;
  }

  public T getData(){
    return this.data;
  }

  public static void main(String[] args) {
    Generics<Integer> intObject = new Generics<>(5);
    System.out.println(intObject.getData());

    Generics<String> stringObject = new Generics<String>("yoo");
    System.out.println(stringObject.getData());
  }
}