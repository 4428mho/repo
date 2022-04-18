package day39_overriding;

public class OverridingChild extends OverridingParent{
    public void method1(){
        System.out.println("child class method1 ");

    }

    public static void main(String[] args) {

        OverridingChild obj=new OverridingChild();
        obj.method1();//child
        obj.method2();//parent

        OverridingParent obj2=new OverridingChild();
        obj2.method2();//parent
        obj2.method1();//child

        OverridingParent obj3=new OverridingParent();
        obj3.method2();//parent
        obj3.method1();//parent
    }
}
