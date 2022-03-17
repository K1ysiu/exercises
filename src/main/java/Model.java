import model.ClothingSize;

import java.text.NumberFormat;
import java.util.Locale;

public class Model {
    public static void main(String[] args) {
       ClothingItem item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L ,19.99, 3);
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
