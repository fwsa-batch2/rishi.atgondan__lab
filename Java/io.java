import java.io.File;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        File rishi = new File("C:\\Users\\Rishi\\Documents\\rishi");

        if(rishi.createNewFile()){
            System.out.println("File is created");
        }else{
            System.out.println("File already exists");
        }
    }
}
