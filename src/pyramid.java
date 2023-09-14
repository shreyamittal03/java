import java.util.Scanner;
class pyramid {
    public static void main(String[] args) {
        int i, j, s, n,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        k = n - 1;
        for (i = 1; i <= k; i++) {
            for (s = 1; s <= i; s++)
                System.out.print(" ");
            for (j = 1; j <= 2 * (k - i) + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
