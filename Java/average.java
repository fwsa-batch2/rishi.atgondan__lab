import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int a, b, c, d, e;
        System.out.println("ENTER 5 SUBJECTS MARK");

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = scan.nextInt();
        scan.close();

        int sum = a + b + c + d + e;
        System.out.println("TOTAL" + sum);

        int average = sum / 5;
        System.out.println("Average" + average);
    }

}
