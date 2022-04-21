import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int original = number;
        int length = Integer.toString(number).length();
        int temp;
        int check = 0;
        while (number > 0) {
            temp = number % 10;
            check = (int) (check + Math.pow(temp, length));
            number = number / 10;
        }
        if (original == check) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

    }
}
