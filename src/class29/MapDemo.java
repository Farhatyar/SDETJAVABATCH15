package class29;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",7);
        groceries.put("Rice",6);
        groceries.put("Meat",8);
        groceries.put("Soap",4);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());

    }
}
