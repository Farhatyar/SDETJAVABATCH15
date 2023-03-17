package class21;

public class Area {
    /* creat 1 class in which create a methods that will calculate
     the area of method name must be called calculateArea
     Rectangle
     square
     */
 void calculateArea(double length, double width) {
        System.out.println("The area of rectangle is: " + length * width);
    }

     void calculateArea(double side) {
        System.out.println("The area of rectangle is: " + side * side);
    }

    public static void main(String[] args) {
        Area area =new Area();
        area.calculateArea(10);
        area.calculateArea(20,12);
    }
}
