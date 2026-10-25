
import java.util.Scanner;
public class circularnei {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int left = (i - 1 + n) % n;
            int right = (i + 1) % n;

            int count = 0;

            if (a[left] > a[i]) {
                count++;
            }

            if (a[right] > a[i]) {
                count++;
            }

            System.out.print(count);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}
