import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class p83 {
    public static void main(String[] args) throws IOException {
        File f = new File("./123.txt");
        f.createNewFile();
        String randomInt = "";
        for (int i = 0; i < 150; i++) {
            int rand = (int) (Math.random() * 300);
            randomInt += rand + " ";
        }
        Path filePath = Path.of("./123.txt");
        Files.writeString(filePath, randomInt);
    }
}
