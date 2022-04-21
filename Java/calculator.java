import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the Fisrt number");
        Scanner sc = new Scanner(System.in);
        int FirstNum = sc.nextInt();

        System.out.println("Enter the operator");
        Scanner sc2 = new Scanner(System.in);
        String operator = sc2.nextLine();

        System.out.println("Enter the second number");
        Scanner sc3 = new Scanner(System.in);
        int SecondNum = sc3.nextInt();
        sc.close();

        int output = 0;

        switch (operator) {
            case "+":
                output = add(FirstNum, SecondNum);
                break;
            case "-":
                output = sub(FirstNum, SecondNum);
                break;
            case "*":
                output = mul(FirstNum, SecondNum);
                break;
            case "%":
                output = div(FirstNum, SecondNum);
                break;
        }
        System.out.println("Your answer is" + output);

    }

    public static int add(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }

    public static int sub(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public static int mul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public static int div(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }

}
