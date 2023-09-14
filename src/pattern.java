import java.util.Scanner;
class pyramide {
    public static void main(String[] args) {
        int i, j, s, n,k=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (s = 1; s <i; s++)
                System.out.print(" ");
            for (j = 1; j <=2*(n-i)+1; j++)
                System.out.print("*");
            k--;
            System.out.println();
        }
    }
}


