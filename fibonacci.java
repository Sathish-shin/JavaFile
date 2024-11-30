package ProgrammingClass;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int num = sc.nextInt();
        isfibonacciseries(num);
    }

    static void isfibonacciseries(int num) {
        int f1 = 0, f2 = 1, f3;
        
        if (num >= 1) {
            System.out.print(f1);
        }
        if (num >= 2) {
            System.out.print("," + f2);
        }

        for (int i = 3; i <= num; i++) {
            f3 = f1 + f2;
            System.out.print("," + f3);
            f1 = f2;
            f2 = f3;
        }
        System.out.println(); // New line after series
    }
}


