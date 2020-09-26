import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int random = 0;
        int[] rollCount = new int[11];
        for (int i = 0; i < n; i++) {
            random = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
            rollCount[random - 2]++;
        }
        return rollCount;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many pairs of dice would you like to roll: ");
        int amountRoll = scan.nextInt();
        int[] percentageRoll = sumOfTwoDice(amountRoll);
        for (int i = 0; i < 11; i++) {
            System.out.println((((double) percentageRoll[i] / (double) amountRoll) * 100) + "% of the values are " + (i + 2) + ".");
        }
    }
}
