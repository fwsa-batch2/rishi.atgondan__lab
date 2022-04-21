import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int NextNum;
        System.out.println("Enter the number of series");
        Scanner scan = new Scanner(System.in);
        int LenghtOfTheSeries = scan.nextInt();
        scan.close();

        for (int i = 0; i < LenghtOfTheSeries; i++) {
            System.out.print(num1 + "   ");
            NextNum = num1 + num2;
            num1 = num2;
            num2 = NextNum;
        }

    }
}
