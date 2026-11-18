import java.util.Scanner;

public class PrimeScores{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int number = 0; number < 10; number++) {
            System.out.print("Enter score " + (number + 1) + ": ");
            scores[number] = input.nextInt();
        }

        int total = 0;
        int count = 0;

        for (int number = 0; number < 10; number++) {
            int num = scores[number];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int number2 = 2; number2 < num; number2++) {
                    if (num % number2 == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                total = total + num;
                count = count + 1;
            }
        }

        System.out.println("Sum: " + total);
        if (count > 0) {
            System.out.println("Average: " + (double) total / count);
        } else {
            System.out.println("Average: 0");
        }
        input.close();
    }
}
