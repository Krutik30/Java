import java.util.Scanner;

class P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value in Meters :");
        double meter = input.nextDouble();
        double feet = meter * 3.28084;
        System.out.print(meter + " Meters = " + feet + " Feets");
    }
}

import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a constant.");
        }
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }
}
