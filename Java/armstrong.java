import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int original = number;
        int temp;
        int check = 0;
        while (number > 0) {
            temp = number % 10;
            check = check + (temp * temp * temp);
            number = number / 10;
        }
        if (original == check) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

    }
}
