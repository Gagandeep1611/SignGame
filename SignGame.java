package Game;

import java.util.Scanner;

public class SignGame {
    public static void main(String[] args) {
        System.err.println("How to play?");
        System.out.println("""
                1. A number will be generated between 1-100.
                2. You have to write a starting number and then proceed to use signs and
                   numbers to reach the target number generated in the first step.
                3. The system will direct you towards the answer using 'Higher' or 'Lower' indications.
                4. You will get 6 tries to reach the nearest answer.""");
        int number, number2, lives = 6;
        String sign;
        boolean end=true;
        int random = (int) ((Math.random() * 100) + 1);
        System.out.println("Number generated!!!");
        System.out.println("Total Lives= " + lives);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your starting number: ");
        number = sc.nextInt();
        while (end) {
            System.out.println("Enter a sign(+,-,/,* only) to go with " + number + " : ");
            sign = sc.next();
            System.out.println("Enter a number:");
            number2 = sc.nextInt();
            if (sign.equals("+")) {
                number = number + number2;
                System.out.println("Number reached: " + number);
            } else if (sign.equals("-")) {
                number = number - number2;
                System.out.println("Number reached: " + number);
            } else if (sign.equals("*")) {
                number = number * number2;
                System.out.println("Number reached: " + number);
            } else if (sign.equals("/")) {
                number = number / number2;
                System.out.println("Number reached: " + number);
            }
            else{
                System.out.println("Invalid Input!!!");
            }
            if (number > random) {
                System.out.print("Indication:");
                System.out.println("Lower.");
                lives--;
                System.out.println("Lives left = " + lives);
            } else if (number < random) {
                System.out.print("Indication:");
                System.out.println("Higher");
                lives--;
                System.out.println("Lives left = " + lives);
            } else if (number == random) {
                System.out.println("You won.");
                System.out.println("The number was: " + random);
                System.out.println("Lives left = " + lives);
                end=false;

            }
            if (lives == 0) {
                System.out.println("Almost had it.");
                System.out.println("The number was: "+ random);
                end=false;
            }
            System.out.println("-------------------------------------");
        }

    }
}
