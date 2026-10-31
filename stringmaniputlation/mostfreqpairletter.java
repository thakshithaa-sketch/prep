import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class mostfreqpairletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split("\\s+");

        LinkedHashMap<String, Integer> freq =
                new LinkedHashMap<>();

        for (String word : words) {

            String pair = "" + word.charAt(0)
                    + word.charAt(word.length() - 1);

            freq.put(pair, freq.getOrDefault(pair, 0) + 1);
        }

        int maxFreq = 0;

        for (int count : freq.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Integer> entry :
                freq.entrySet()) {

            if (entry.getValue() == maxFreq) {

                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(entry.getKey());
            }
        }

        System.out.println(result);
    }
}
