package Ch10ArrayLists;

import java.util.ArrayList;

public class AddStar {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("my");
        list.add("name");
        list.add("jeff");
        addStars(list);
        System.out.println(list);
    }
    public static void addStars(ArrayList<String> list){
        int size = list.size() * 2;
        for(int i = 0; i < size; i++){
            i++;
            list.add(i, "*");
        }
    }
}
