package javaHackathon;

public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("burger",150);
        Dish dish1 = new Dish("Momos", 250);
        Restaurant restaurant = new Restaurant();
        String msg = restaurant.addTable(1,dish);
        System.out.println(msg);
        String msg2 = restaurant.addTable(1,dish1);
        System.out.println(msg2);
        System.out.println(restaurant.calculateBill(1));
        System.out.println(restaurant.getAllDishStartsWith('M'));
    }
}
