
import java.util.Scanner;

public class subarray1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int totalSum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            prefixSum += a[i];

            int suffixSum = totalSum - prefixSum;
            int difference = Math.abs(prefixSum - suffixSum);

            if (difference % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
