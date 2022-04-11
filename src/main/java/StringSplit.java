public class StringSplit {
    public static void main(String[] args) {
        String string = "09-100-2-18";
        String[] parts = string.split("-");

        for (String item:parts) {
            System.out.println(item);
        }

    }
}
