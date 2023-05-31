import java.io.*;
import java.util.*;

class p84 {
    public static void main(String[] args) {
        String fName = args[0];
        TreeSet<String> ts = new TreeSet<>();
        File file = new File(fName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                ts.add(sc.next());
            }
            System.out.println(ts);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
