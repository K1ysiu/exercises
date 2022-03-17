public class WyjMain3 {
    public static void main(String[] args) {
        Boolean aaa = null;

        try{
            if (aaa) {
                System.out.println("t");
            }
        } catch ( NullPointerException e ){
            System.out.println(e.getMessage());
        }


    }
}
