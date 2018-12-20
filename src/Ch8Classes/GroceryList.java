package Ch8Classes;

import java.util.Arrays;

public class GroceryList {
    private double numItems;
    private GroceryItemOrder[] groceryList;
    public GroceryList(int items){
        this.numItems = items;
        this.groceryList = new GroceryItemOrder[10];
    }

    public void addItem(GroceryItemOrder item){
        int openIndex = 0;
        for(int i = 0; i < groceryList.length; i++){
            if(groceryList[i] == null){
                groceryList[i] = item;
                break;
            }
            else if(i == groceryList.length - 1){
                System.out.println("Cannot add, list is full. Max 10 items.");
            }
        }
    }

    public double getTotalCost() {
        int totalCost = 0;
        int lastOpen = 0;
        for(int i = 0; i < groceryList.length; i++){
            if(groceryList[i] == null){
                lastOpen = i;
                break;
            }
            else if(i == groceryList.length - 1)
                lastOpen = groceryList.length;
        }
        for(int i = 0; i < lastOpen; i++){
            totalCost += groceryList[i].getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return Arrays.toString(groceryList);
    }
}
