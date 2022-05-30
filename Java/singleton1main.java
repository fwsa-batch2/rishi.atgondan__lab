public class singleton1main {
   public static void main(String[] args) {
       singleton1 Rishi = singleton1.getInstance();
       Rishi.print("Chithraj");
       System.out.println(Rishi);
       singleton1 Meenu = singleton1.getInstance();
       Meenu.print("Smile");
       System.out.println(Meenu);
   } 
}
