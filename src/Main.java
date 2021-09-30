import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bulls and " +
                "cows game!");
        System.out.println("This is a logical mind game"
                + "\nHere B means one of your guessing number is inside the"
                + " hidden number and in the right place " +
                "\nHere C means one of your guessing number " +
                "is correct but inside the wrong place \n");

        Random random = new Random();
        int intRandom = random.nextInt(99);

        while (intRandom < 10) {
            intRandom++;
        }

        String s = String.valueOf(intRandom);
        char charRandom1 = s.charAt(0);
        char charRandom2 = s.charAt(1);

        while (true) {
            if (charRandom1 == charRandom2) {
                charRandom1++;
            }

            System.out.println("Enter your 2 digits");
            String strRandom = scanner.nextLine();//5 6
            int input = Integer.parseInt(strRandom);

            if (input < 10) {
                System.out.println("You entered only one number" +
                        " Please enter two numbers");
                System.out.println();
                continue;
            }

            char charInput1 = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if (charRandom1 == charInput1 && charRandom2 == charInput2) {
                System.out.println("Congrats");
                break;
            } else if (charRandom1 == charInput1 || charRandom2 == charInput2) {
                System.out.println("1B,0C");
            } else if (charRandom1 == charInput2 && charRandom2 == charInput1) {
                System.out.println("0B,2C");
            } else if (charRandom1 != charInput2 && charRandom2 != charInput1
                    && charRandom1 != charInput1 && charRandom2 != charInput2) {
                System.out.println("0B,0C");
            } else if (charRandom1 == charInput2 || charRandom2 == charInput1) {
                System.out.println("0B,1C");
            }
        }
    }
}
