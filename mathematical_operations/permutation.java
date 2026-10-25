import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to calculate nPr: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();

        long numerator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }

        long denominator = 1;
        for (int i = 1; i <= n - r; i++) {
            denominator *= i;
        }

        System.out.println(numerator / denominator);
        sc.close();
    }
}
