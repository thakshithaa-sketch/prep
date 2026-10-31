
import java.util.Scanner;

public class festival_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        int maxBuses = (n + 79) / 80;

        int minimumCost = Integer.MAX_VALUE;

        for (int buses = 0; buses <= maxBuses; buses++) {

            int remaining = Math.max(0, n - buses * 80);

            int shuttles = (remaining + 7) / 8;

            int cost = (buses * p + shuttles * q) * 75;

            minimumCost = Math.min(minimumCost, cost);
        }

        System.out.println(minimumCost);
    }
}
