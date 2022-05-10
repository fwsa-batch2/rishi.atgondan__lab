public class inheritance {
    public static void main(String[] args) {
        son obj = new son();
        obj.or();
        child obj1 = new child();
        String obj2 = obj1.name2;
        System.out.println(obj2);
        }
}

class parent{
    String name2 = "rishi";
}

class child extends parent{
    String name1 = "Brainy";
    
}

class father{
   void or(){
       System.out.println("hi hello");
   }
}

class son extends father{
    
    void or(){
        System.out.println("kfksdnc");
    }
}
