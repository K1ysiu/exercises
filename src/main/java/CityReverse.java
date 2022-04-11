import java.util.*;

public class CityReverse {
    public static void main(String[] args) {

        System.out.println(reverse(CityList.initialize()));

    }
    public static List<City> reverse (List<City> list){
        List<City>  reverseList = new ArrayList<>();

        ListIterator<City> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            reverseList.add(iterator.previous());
        }
        return list;
    }

}

