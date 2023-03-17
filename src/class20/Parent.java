package class20;

public class Parent {

    String name;
    static String lastName;
   // private Parent (){
     //   System.out.println("I am a Parent Class constructor");

   // }

    public static void main(String[] args) {
        Parent p=new Parent();
    }
    public void hello(){
        System.out.println("hello from parent class");
    }
    protected static void bye(){
        System.out.println("protected method bye from parent class");
    }
    private void money(){
        System.out.println("protected method money from parent class");
    }
}
