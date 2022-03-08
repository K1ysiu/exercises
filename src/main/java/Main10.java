public class Main10 {
    public static void main(String[] args) {
        int grom1A = 4;
        int blysk1A = 3;
        int grom2B = 2;
        int blysk2B = 0;
        System.out.println(footballWin(grom1A, grom2B, blysk1A, blysk2B));
    }

    static String footballWin(int grom1A, int grom2B, int blysk1A, int blysk2B) {
        int sumGrom = grom1A + grom2B;
        int sumBlysk = blysk1A + blysk2B;

        if (sumBlysk == sumGrom) {
            if (grom2B > blysk1A) {
                return "1";
            } else if (blysk1A > grom2B) {
                return "2";
            } else {
                return "X";
            }
        } else if (sumBlysk > sumGrom) {
            return "2";
        } else {
            return "1";
        }
    }
}

