package test;
import java.io.*;

public class table {
   
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // System.out.println(N);
        for(int i=1;i<= 10; i++){
            // System.out.println(i);
            System.out.println(N + " x "+ i + " = " + N*i);
        }
        bufferedReader.close();
    }
}
    

