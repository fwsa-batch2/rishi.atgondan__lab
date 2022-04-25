import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner inputValue = new Scanner(System.in);
        int number = inputValue.nextInt();
        inputValue.close();
        int originalNumber = number;
        int temp = 0;

        while (number != 0) {
            int fact = 1;
            int lastDigit = number % 10;

            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            temp = temp + fact;
            number = number / 10;
        }
        if (originalNumber == temp) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("It is not a strong number");
        }

    }

}