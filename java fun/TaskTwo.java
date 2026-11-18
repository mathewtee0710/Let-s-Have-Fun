public class TaskTwo{
    public static void main(String[] args) {
        int average = 0;

        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0) {
                average += number;
            }
        }

        System.out.println("The average is: " + average);
    }
}
