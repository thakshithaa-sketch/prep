import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect square: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println(false);
        } else if (n < 2) {
            System.out.println(true);
        } else {
            int left = 1;
            int right = n;
            boolean found = false;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid;

                if (square == n) {
                    found = true;
                    break;
                } else if (square < n) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(found);
        }

        sc.close();
    }
}


