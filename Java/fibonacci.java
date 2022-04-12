public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);

        int answer;

        for (int i = 0; i <= 10; i++) {
            answer = n1 + n2;
            System.out.println(answer);
            n1 = n2;
            n2 = answer;
        }
    }
}
