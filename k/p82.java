import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class p82 {
    static String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("./temp.txt"));
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
                System.out.println(longest_word);
            }
        }
        return longest_word;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Longest word in the file is : ");
        findLongestWords();
    }
}
