package javaHackathon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Restaurant {
    Map<Integer, ArrayList<Dish>> table = new HashMap<>();
    public String addTable(int tableNo,Dish dish){
        if(table.containsKey(tableNo)){
            table.get(tableNo).add(dish);
            return "Added to the old order";
        }
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(dish);
        table.put(tableNo, dishes);
        return "Added to the new order";
    }
    public int calculateBill(int tableNo){
        ArrayList<Dish> dishes = table.get(tableNo);
        int sum =0;
        for(Dish dish: dishes){
            if(dish!=null){
               sum += dish.getCost();
            }
        }
        return sum;
    }
    public int getAllDishStartsWith(char startingCharacter){
        int count=0;
        Set<Integer> keys =  table.keySet();
        for(Integer key: keys){
            ArrayList<Dish> dishes = table.get(key);
            for(Dish dish: dishes){
                if(dish.getName().startsWith(String.valueOf(startingCharacter))){
                    count++;
                }
            }
        }
        return count;
    }

}
