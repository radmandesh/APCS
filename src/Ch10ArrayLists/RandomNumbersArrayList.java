package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbersArrayList {
    public static void main(String[] args)throws FileNotFoundException {
        File f = new File("randomNumbers.txt");
        Scanner scan = new Scanner(f);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(createList(list, scan));
        System.out.println("Average: " + average(list));
        System.out.println("min: " + min(list));
        System.out.println("max: " + max(list));
        System.out.println(filterEvens(list));
    }
    public static String createList(ArrayList<Integer> list, Scanner scan){
        while (scan.hasNext()) {
            list.add(scan.nextInt());
        }
        return list.toString();
    }
    public static double average(ArrayList<Integer> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum+=list.get(i);
        }
        return sum/list.size();
    }
    public static int min(ArrayList<Integer> list){
        int min = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }
    public static int max(ArrayList<Integer> list){
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
    public static String filterEvens(ArrayList<Integer> list){
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) % 2 == 0)
                list.remove(i);
        }
        return list.toString();
    }
}
