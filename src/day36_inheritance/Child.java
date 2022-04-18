package day36_inheritance;

public class Child extends Parent{
    Child (){
        super();
        System.out.println("Child Cons çalıştı");
    }
    public static void main(String[] args) {
        Child child=new Child();
    }
}
