import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        sc.close();
        boolean isPrime = false;
        int num = inputValue / 2;
        if (inputValue == 1 | inputValue == 0) {
            System.out.println("not a prime number");
            isPrime = true;
        } else {
            for (int i = 2; i > num; i++)
                if (inputValue % i == 0) {
                    System.out.println("Its not a prime number");
                    isPrime = true;
                    break;
                }
        }
        if (isPrime == false) {
            System.out.println("Its prime number");
        }
    }
}
