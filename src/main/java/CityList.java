import java.util.ArrayList;
import java.util.List;

public class CityList {
    public static void main(String[] args) {

//        for ( City myCity : initialize()) {
//            System.out.println(myCity);
//        }

        for (City subitem : sublist(1, 3)) {
            System.out.println(subitem);
        }
    }

    public static List<City> initialize() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("Paris", 2160000));
        cityList.add(new City("London", 8982000));
        cityList.add(new City("Warsaw", 1765000));
        cityList.add(new City("Kyiv", 2884000));
        cityList.add(new City("Krakow", 757000));
        return cityList;
    }

    public static List<City> sublist(int start, int end) {
        List<City> newList = new ArrayList<>();
        List<City> list = initialize().subList(start,end);
        return newList;
    }
}
