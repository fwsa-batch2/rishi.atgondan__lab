import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner InputValue = new Scanner(System.in);
        int number = InputValue.nextInt();
        InputValue.close();

        int originalNumber = number;
        int lenght = Integer.toString(number).length();
        int check = 0;
        while (number > 0) {
            int temp = number % 10;
            check = (int) (check + Math.pow(temp, lenght));
            number = number / 10;
        }
        if (originalNumber == check) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("Its is not an armstrong number");
        }

    }
}