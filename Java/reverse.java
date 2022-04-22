import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner inputValue = new Scanner(System.in);
        int number = inputValue.nextInt();
        inputValue.close();
        int reverse = 0;

        while (number != 0) {
            int answer = number % 10;
            reverse = reverse * 10 + answer;
            number = number / 10;
        }
        System.out.println("The reverse number is " + reverse);

    }
}
