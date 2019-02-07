package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VocabularyV1 {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<String> list1 = analyze("text1.txt");
        ArrayList<String> list2 = analyze("text2.txt");
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<String> overlap = overlap(list1, list2);
        System.out.println(overlap);
        System.out.println(pctOverlap(list1, overlap));
        System.out.println(pctOverlap(list2, overlap));
    }
    public static ArrayList<String> analyze(String file) throws FileNotFoundException{
        File f = new File(file);
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            list.add(scan.next().toLowerCase());
        }
        Collections.sort(list);
        ArrayList<String> newList = new ArrayList<>();
        newList.add(list.get(0));
        String toAdd;
        for(int i = 1; i < list.size(); i++){
            toAdd = list.get(i);
            if(toAdd.charAt(toAdd.length() - 1) < (char)97)
                toAdd = toAdd.substring(0, toAdd.length() - 1);
            if(!toAdd.equals(newList.get(newList.size()-1))) {
                newList.add(toAdd);
            }
        }
        return newList;
    }

    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> overlapped = new ArrayList<>();
        int bigger;
        while(i1 < list1.size() - 1 && i2 < list2.size() - 1){
            String get = list1.get(i1);
            String get2 = list2.get(i2);
            if(get.equals(get2)){
                overlapped.add(get);
                i1++;
                i2++;
            }
            else if(get.compareTo(get2) < 0){
                i1++;
            }
            else{
                i2++;
            }
        }

        return(overlapped);
    }

    public static double pctOverlap(ArrayList<String> list, ArrayList<String> overlap){
        return (double)overlap.size() / list.size() * 100.0;
    }
}
