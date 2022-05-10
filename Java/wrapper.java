public class wrapper{
    public static void main(String[] args) {
        // autoboxing
        boolean rishi = true;
        Boolean rishi2 = Boolean.valueOf(rishi);
        Boolean rishi1 = rishi;
        System.out.println(rishi1);
        System.out.println(rishi2);

        // unboxing
        Double num = 3.456789;
        double num2 = num;
        double num3 = num.doubleValue();
        System.out.println(num2);
        System.out.println(num3);

    }
}