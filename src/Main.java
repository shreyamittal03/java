import java.util.Scanner;
class programs {
    public static void main(String args[]) {
        demo aa = new demo();
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1-> sumofdigits \n2-> prodofdigits \n3-> reverse \n4-> palindrome \n5-> factorial \n6-> fibonacci \n7-> prime \n8->armstrong \n9-> power \n10-> tab \n 11-> Exit \n Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    aa.getdata();
                    aa.sumofdigits();
                    break;
                case 2:
                    aa.getdata();
                    aa.prodofdigits();
                    break;
                case 3:
                    aa.getdata();
                    aa.reverse();
                    break;
                case 4:
                    aa.getdata();
                    aa.palindrome();
                    break;
                case 5:
                    aa.getdata();
                    aa.factorial();
                    break;
                case 6:
                    aa.getdata();
                    aa.fibonacci();
                    break;
                case 7:
                    aa.getdata();
                    aa.prime();
                    break;
                case 8:
                    aa.getdata();
                    aa.armstrong();
                    break;
                case 9:
                    aa.getdata();
                    aa.power();
                    break;
                case 10:
                    aa.getdata();
                    aa.tab();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 11);
    }
}

    class demo {
        int i;

        void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter any number");
            i = sc.nextInt();
        }

        void sumofdigits() {
            int sum = 0;
            while (i > 0) {
                sum = sum + (i % 10);
                i = i / 10;
            }
            System.out.println("sum of digits is" + sum);
        }


        void prodofdigits() {
            int prod = 1;
            while (i > 0) {
                prod = prod * (i % 10);
                i = i / 10;
            }
            System.out.println("prod of digits is" + prod);
        }

        void reverse() {
            int rev = 0;
            while (i > 0) {
                rev = rev * 10 + (i % 10);
                i = i / 10;
            }
            System.out.println("reverse of number" + rev);
        }

        void palindrome() {
            int rev = 0;
            while (i > 0) {
                rev = rev * 10 + (i % 10);
                i = i / 10;
                if (i == rev) {
                    System.out.println("number is palindrome" + rev);
                } else {
                    System.out.println("number is not palindrome");
                }
            }
        }

        void factorial() {
            int fact = 1;
            while (i > 0) {
                fact = fact * i;
                i--;
            }
            System.out.println("factorial of number is" + fact);
        }

        void fibonacci() {
            int x = 0, y = 1, z = 0;
            while (z <= i) {
                System.out.println(z);
                x = y;
                y = z;
                z = x + y;
            }
        }

        void prime() {
                if (i % 2 == 0) {
                    System.out.println("number is prime" + i);
                } else {
                    System.out.println("number is not prime");
                }
        }

        void armstrong() {
            int x, y, count = 0;
            x = i;
            y = i;
            while (x > 0) {
                x = x / 10;
                count = count + 1;
            }
                int prod = 1, sum = 0, digit = i % 10;
                for (int j = 1; j < count; j++) {
                    prod = prod * digit;
                    sum = sum + prod;}
                if (sum == y) {
                    System.out.println("number is armstrong" + i);
                } else {
                    System.out.println("number is not armstrong");
                }
            }

        void power() {
            int m, pow = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the power to be raised to i");
            m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                pow = pow * i;
            }
            System.out.println("power to the base i is" + pow);
        }

        void tab() {
            int k;
                for (int j = 1; j <= 10; j++) {
                    k = i * j;
                    System.out.println(k);
                }
            }
    }









