import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Hello_file {
    public static void main(String[] args) throws FileNotFoundException{
        File file  = new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);            
        }

    }
}