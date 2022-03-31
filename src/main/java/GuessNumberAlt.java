public class GuessNumberAlt {
    public static void main(String[] args) {


        int max = 1000;
        int min = 0;
        int guess = ((max - min) / 2) + min;
        int randNumber = getRandNum();
        System.out.println(randNumber);
        int counter = 10;

        System.out.println("Pick a number from 0 to 1000 and PC will guess it in max 10 moves.");

        while ((guess != randNumber) && (counter != 0)) {
            guess = ((max - min) / 2) + min;
            if (guess > randNumber) {
                max = guess;
                counter--;
                System.out.println(guess + " too much");
            } else if (guess < randNumber) {
                min = guess;
//                guess = ((max - min) / 2) + min;
                counter--;
                System.out.println(guess + " too low");
            } else {
                System.out.println("PC won! The number is " + guess);
            }
        }
    }

    public static int getRandNum() {
        return (int) ((Math.random() * 1000));
    }
}
