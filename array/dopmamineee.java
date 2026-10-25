import java.util.Scanner;
public class dopmamineee {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements, L and R: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int level = 0;
        int maxLevel = 0;
        int minLevel = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= L && a[i] <= R) {
                level++;
            } else {
                level--;
            }

            if (level > maxLevel) {
                maxLevel = level;
            }

            if (level < minLevel) {
                minLevel = level;
            }
        }

        System.out.println(maxLevel + " " + minLevel);

        sc.close();
    }
    
}
