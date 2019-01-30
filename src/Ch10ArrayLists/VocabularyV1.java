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
    }
    public static ArrayList<String> analyze(String file) throws FileNotFoundException{
        File f = new File(file);
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            list.add(scan.next());
        }
        Collections.sort(list);
        ArrayList<String> newList = new ArrayList<>();
        newList.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) != list.get(i-1))
                newList.add(list.get(i));

        }
        return newList;
    }
}
