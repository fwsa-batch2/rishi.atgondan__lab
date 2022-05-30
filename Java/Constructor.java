public class Constructor {
    String str = "hi";
    String str2 = "hello";
   Constructor(String a, String b){
       this.str= a;
       this.str2 =b;
       System.out.println(str+"   "+str2);

   }
       public static void main(String[] args) { 
          Constructor obj2 = new Constructor("rishi","sangi");
          System.out.println(obj2.str + " ," + obj2.str2);

       }
   } 

