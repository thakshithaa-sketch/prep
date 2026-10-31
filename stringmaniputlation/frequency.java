
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq1[ch - 'A']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq2[ch - 'A']++;
        }

        int cost = 0;

        for (int i = 0; i < 26; i++) {
            if (freq2[i] > freq1[i]) {
                cost += freq2[i] - freq1[i];
            }
        }

        System.out.println(cost);
    }
}
