import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num1 = 1;
        System.out.println("Enter the lenght of fatorials");
        Scanner scan = new Scanner(System.in);
        int Fact = scan.nextInt();
        scan.close();

        for (int i = 1; i <= Fact; i++) {
            num1 = num1 * i;
            System.out.print(num1 + " , ");
        }
       
    }
}
