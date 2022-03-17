import model.ClothingSize;

public class ClothingItem {

    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    private String type;
    private ClothingSize size;
    public double price;
    private int quantity;

    public ClothingItem(ClothingSize size, double price, int quantity) {  //
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public ClothingItem(String type, ClothingSize size, double price, int quantity) { //ClothingItem item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L ,19.99, 3);
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}