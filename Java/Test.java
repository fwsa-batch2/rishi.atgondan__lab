public class Test {
    public static int num = 10;

    Test() {
        num = 10;
    }

    public static void main(String[] ar) {
        Test obj = new Test();
        System.out.println(obj.num);
        
    }

    public static void bs() {
        num = 11;
    }
}