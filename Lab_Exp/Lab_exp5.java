package OOP.Lab_Exp;
import java.util.*;

class Order {
    private int orderId;
    private List<String> itemNames;     private boolean cashOnDelivery;
    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId;         this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;     }      public int getOrderId() {         return orderId;
    }


    public List<String> getItemNames() {
        return itemNames;
    }
    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    @Override
    public String toString() {
        return "Order Id: " + getOrderId() + ", Item names: " + getItemNames() + ", Cash on delivery: " + isCashOnDelivery();
    }
}
public class Lab_exp5 {

    public static List<String> getItems(List<Order> orders) {
        List<String> allItems = new ArrayList<>();
        for (Order order : orders) {
            allItems.addAll(order.getItemNames());
        }
        return allItems;
    }
    public static void main(String[] args) {

        List<Order> list = new ArrayList<Order>();

        List<String> items1 = new ArrayList<String>();         items1.add("Jeans");         items1.add("Shirt");         items1.add("Belt");
        Order order1 = new Order(101 ,  items1, true);         list.add(order1);

        List<String> items2 = new ArrayList<String>();         items2.add("Tie");
        Order order2 = new Order(102 ,  items2, true);         list.add(order2);

        List<String> items3 = new ArrayList<String>();         items3.add("Tshirt");         items3.add("Socks");         items3.add("Tie");
        Order order3 = new Order(103 ,  items3, true);         list.add(order3);

        List<String> items = getItems(list);
        System.out.println(items);
    }

}
    

