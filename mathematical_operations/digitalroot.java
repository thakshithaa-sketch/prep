
import java.util.Scanner;

public class digitalroot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n);
        sc.close();
    }
}

/* Formula: digital root = 1 + (n - 1) % 9 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(1 + (n - 1) % 9);
        }

        sc.close();
    }
}




*/