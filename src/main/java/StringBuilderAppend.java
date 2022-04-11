public class StringBuilderAppend {
    public static void main(String[] args) {
        String[] myString = {"aaa", "bbb"};

        System.out.println(stringFromArray(myString));
    }
    static String stringFromArray(String[] str){
        StringBuilder strBuiler = new StringBuilder();
        for (String item: str) {
            strBuiler.append(item + " ");
        }
        return strBuiler.toString();
    }
}
