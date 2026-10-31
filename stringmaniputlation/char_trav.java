    
import java.util.Scanner;

public class char_trav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int firstIndex = s.indexOf(ch);

            int repeat = firstIndex + 1;

            for (int j = 0; j < repeat; j++) {
                result.append(ch);
            }

            if (i < s.length() - 1) {
                result.append("-");
            }
        }

        System.out.println(result);
    }
}


