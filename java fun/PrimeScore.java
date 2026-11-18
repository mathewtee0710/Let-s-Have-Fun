import java.util.Scanner;

public class PrimeScore{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        System.out.print("Prime scores: ");
        for (int i = 0; i < 10; i++) {
            int num = scores[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        input.close();
    }
}
