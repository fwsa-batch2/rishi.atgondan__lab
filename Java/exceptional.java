
public class exceptional {
    public static void main(String[] args ) {         
    try {
        int[] num ={1,2,3,4,5};
        System.out.println(num[8]); 
    } catch (Exception e) {
        System.out.println(e);
    } finally{
        System.out.println("finally error");
    }
}
}

