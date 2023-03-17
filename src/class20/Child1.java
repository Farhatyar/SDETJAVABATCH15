package class20;

public class Child1 extends Parent {

    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye(); // accessing static method in a static way by using class name
        Child1.bye();//accessing static method from the parent

        c1.name="Khan";
        Child1.lastName="Ahmad";

    }
}
