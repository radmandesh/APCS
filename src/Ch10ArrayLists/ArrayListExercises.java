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
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(11);
        list1.add(101);
        list1.add(105);
        list2.add(3);
        list2.add(5);
        list2.add(12);
        list2.add(101);
        list2.add(106);
        System.out.println(intersect(list1, list2));
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
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> intersect = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j))
                    intersect.add(list1.get(i));
            }
        }
        return intersect;
    }

}
