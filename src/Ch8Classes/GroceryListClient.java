package Ch8Classes;

public class GroceryListClient {
    public static void main(String[] args){
        GroceryList list = new GroceryList(10);
        for(int i = 0; i < 3; i++){
            System.out.println(list);
            list.addItem(new GroceryItemOrder("lettuce", 2, 3));
        }
        System.out.println(list.getTotalCost());

    }
}
