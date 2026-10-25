
import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            if (a[i] + a[i + 2] == a[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
