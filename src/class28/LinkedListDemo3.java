package class28;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        long stratTime=System.currentTimeMillis();

       LinkedList<String> number=new LinkedList<>();
        for(int i=0; i<1000000; i++){
            number.add(0,"TestData");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-stratTime);
    }
}
