import java.util.Scanner;
public class genseq {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the initial elements: ");
        for (int i = 0; i < 6; i++) {
            int value = sc.nextInt();

            if (i < n) {
                a[i] = value;
            }
        }

        for (int i = 6; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }

        System.out.println();
        sc.close();
    }
}
