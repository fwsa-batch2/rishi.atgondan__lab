public class multithreading extends Thread {
    public void run() {
        System.out.println("Threading is running");
        
    }

    public static void main(String[] args) {
        multithreading thread_a = new multithreading();
        multithreading thread_b = new multithreading();
        multithreading thread_c = new multithreading();

        thread_a.run();
        thread_b.run();
        thread_c.run();
    }
    
    
}
