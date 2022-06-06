import java.util.Scanner;
public class assessment {
    public static StringBuilder reverseStr(String s) {
        int i = s.length() - 1;
        StringBuilder rs = new StringBuilder();
        do{
            rs.append(s.charAt(i));
            i--;
        } while(i >= 0);
        return rs;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Words");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        sc.close();
        String output = new String(reverseStr(input));
        
        System.out.println(output);
    }
}