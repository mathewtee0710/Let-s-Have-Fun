public class TaskThree{
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        
        for (int number = 1; number <= 10; number++) {
                sum += number;
        }

        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0) {
                average += number;
            }
        }
        System.out.println("The sum of the score is: " + sum);
        System.out.println("The average is: " + average);
    }
}
