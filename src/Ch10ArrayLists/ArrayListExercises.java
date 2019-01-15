package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data.txt");
        Scanner scan = new Scanner(f);
        ArrayList<String> list = new ArrayList<>();
        display(list, scan);
        displayRvrs(list);
        displayPlrl(list);
        displayNoPlrl(list);
        System.out.println(list.size());
    }
    public static void display(ArrayList<String> list, Scanner scan){
        while (scan.hasNext()) {
            String word = scan.next();
            System.out.println(word);
            list.add(word);
        }
        System.out.println();
    }
    public static void displayRvrs(ArrayList<String> list){
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public static void displayPlrl(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            if(word.charAt(list.get(i).length() - 1) == 's'){
                System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));

            }
            else{
                System.out.println(list.get(i));
            }
        }
        System.out.println();
    }
    public static void displayNoPlrl(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            if(word.charAt(list.get(i).length() - 1) != 's'){
                System.out.println(list.get(i));

            }
        }
        System.out.println();
    }
}
