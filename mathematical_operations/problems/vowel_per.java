import java.util.Scanner;

public class vowel_per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String vowels = "aeiouAEIOU";
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.indexOf(ch) == -1) {
                consonants++;
            }
        }

        if (consonants == 0) {
            System.out.println(0);
        } else {
            long fact = 1;

            for (int i = 1; i <= consonants; i++) {
                fact *= i;
            }

            System.out.println(fact);
        }

        sc.close();
    }
}
