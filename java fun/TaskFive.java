import java.util.Scanner;

public class TaskFive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;

        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter score " + number + ": ");
            int score = scanner.nextInt();

            if (score % 2 == 0) {
                evenSum = evenSum + score;
            }
        }

        System.out.println("The sum of the even numbers is: " + evenSum);
    }
}

