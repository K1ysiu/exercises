public class Main4 {
    public static void main(String[] args) {
        String name = "Adam";
        String surname = "Wiśniewski";
        String nickname = "Kot";

        System.out.println(createName(name, surname, nickname));

    }

    public static String createName(String name, String surname, String nickname) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" \"" + surname + "\" ");
        stringBuilder.append(nickname);
        return stringBuilder.toString();
    }
}
