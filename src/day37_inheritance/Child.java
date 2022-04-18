package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    Child(){
        super();
        System.out.println("child parametresiz constructor");
    }
    Child(int s){
        System.out.println("child class parametreli cons");
    }
    Child(int sayi1,int sayi2){
        super(sayi1,sayi2);
        System.out.println("iki parametreli constuctor");
    }

    public static void main(String[] args) {

        Child child2=new Child(5,8);

    }
}
