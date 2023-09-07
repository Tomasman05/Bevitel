import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fajlkez {
    public void beolvas() throws FileNotFoundException{
        File file = new File("Valami.txt");
        Scanner sc = new Scanner(file, "utf-8");
        while(sc.hasNextLine()){
            System.out.println("|"+ sc.nextLine()+"|");
        }
    }
}
