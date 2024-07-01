package OOP.Lab_Exp;
import java.util.*;

class Order {
    private int orderId;
    private List<String> itemNames;     
    private boolean cashOnDelivery;
    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId; 
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;     
    }   

    public int getOrderId() {         
        return orderId;
    }
    public List<String> getItemNames() {
        return itemNames;
    }
    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    // @Override
    // public String toString() {
    //     return "Order Id: " + getOrderId() + ", Item names: " + getItemNames() + ", Cash on delivery: " + isCashOnDelivery();
    // }
}
public class Lab_exp5 {
    public static void main(String[] args) {

        ArrayList<Order> orders1 = new ArrayList<>(Arrays.asList(
            new Order(101, new ArrayList<>(Arrays.asList("Jeans", "Shirt", "Belt")), true),
            new Order(102, new ArrayList<>(Arrays.asList("Tie", "Shirt")), true),
            new Order(103, new ArrayList<>(Arrays.asList("Tshirt", "Socks", "Tie")), true)
    ));
    System.out.println(getItems(orders1));

    ArrayList<Order> orders2 = new ArrayList<>(Arrays.asList(
            new Order(101, new ArrayList<>(Arrays.asList("Sportswear", "Dumbbell")), true),
            new Order(102, new ArrayList<>(Arrays.asList("", "Jeans")), true),
            new Order(103, new ArrayList<>(Arrays.asList("Smartwatch", "Fitnessband", "Joggers")), true)
    ));
    System.out.println(getItems(orders2)); 
}

public static ArrayList<String> getItems(ArrayList<Order> orders) {
    ArrayList<String> allItems = new ArrayList<>();
    for (Order order : orders) {
        allItems.addAll(order.getItemNames());
    }
    return allItems;
}

    }


    

