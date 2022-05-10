public class string {
    public static void main(String[] args) {
        String a = "Rishi";
        System.out.println(a.concat(" Good is a"));
        split();
    }

    public static void split() {
        String a = "Rishi is good boy";
        String[] mylist = a.split(" ",4);
        for (String ans : mylist){
        System.out.println(ans);
        }

        String len = "helloworld";
        System.out.println(len.length());
        System.out.println(len.substring(3, 5));
    }
}
