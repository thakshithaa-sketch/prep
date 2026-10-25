import java.util.Scanner;

public class max_vowel {

    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static long maximumPermutation(String[] arr, int n) {
        String vowels = "aeiouAEIOU";
        long maximum = 0;

        for (int i = 0; i < n; i++) {
            String word = arr[i];
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (vowels.indexOf(ch) == -1) {
                    count++;
                }
            }

            if (count > 0) {
                long permutations = factorial(count);

                if (permutations > maximum) {
                    maximum = permutations;
                }
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(maximumPermutation(arr, n));

        sc.close();
    }
}
