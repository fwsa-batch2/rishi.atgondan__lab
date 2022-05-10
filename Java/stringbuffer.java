public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Rishi");
        System.out.println(a.append(" is a good boy"));

        StringBuffer b = new StringBuffer("Rishi");
        System.out.println(b.insert(3, "gamer"));

        StringBuffer x = new StringBuffer("Rishi");
        System.out.println(x.replace(0, 2, "ufhfer"));

        StringBuffer y = new StringBuffer("Rishi is good boy");
        System.out.println(y.delete(3, 10));

        StringBuffer m = new StringBuffer("Reverse");
        System.out.println(m.reverse());

        //default
        StringBuffer d = new StringBuffer();
        System.out.println(d.capacity());

        //manual
        StringBuffer p = new StringBuffer("This is my laptop");
        System.out.println(p.capacity());
    }
}
