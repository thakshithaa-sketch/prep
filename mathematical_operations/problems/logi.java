
import java.util.Scanner;

public class logi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform logical operations: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("OR: " + (A | B));
        System.out.println("AND: " + (A & B));
        System.out.println("XOR: " + (A ^ B));
        System.out.println("NOT A: " + (~A));
        System.out.println("NOT B: " + (~B));

        sc.close();
    }
}
