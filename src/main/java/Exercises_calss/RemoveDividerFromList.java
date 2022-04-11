package Exercises_calss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDividerFromList {
    public static void main(String[] args) {
        List<Integer> list =
                new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19));

//        for (int i = 0; i < integerList.size(); i++) {
//            System.out.println(integerList.get(i));
//        }

        //        for (int number : integerList) {
//            System.out.println(number);
//        }

        for (Integer integer : removeDivider(list, 2)) {
            System.out.println(integer);
        }

    }
    public static List<Integer> removeDivider (List<Integer> list, int divider){
    List<Integer> listAfterRemove = new ArrayList<>();
        int i = 0;
    while (i < list.size()){
        if(list.get(i) % divider == 0){
            listAfterRemove.add(list.get(i));

        }
        i++;

    }
        return listAfterRemove;
    }
}
