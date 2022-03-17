import model.ClothingSize;

import java.text.NumberFormat;
import java.util.Locale;

public class Model {
    public static void main(String[] args) {
       ClothingItem item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L ,19.99, 3);
       ClothingItem item2 = new ClothingItem(ClothingSize.S, 10.11, 2);

        double price = item.price;
        item.price = 3;
        System.out.println(price);
        System.out.println(item.getPrice());

        String something = ClothingItem.SHIRT;

        System.out.println(item.getPrice() + "            " + item2.getPrice());
        System.out.println();

//        item.setType("Shirt");
//        item.setSize("M");
//        item.setPrice(19.99);
//        item.setQuantity(3);

        double totalPrice = item.getPrice() * item.getQuantity();
        NumberFormat formater = NumberFormat.getCurrencyInstance();
        String output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formater.format(totalPrice));
        System.out.println(output);

    }

}
