package ProgrammingClass;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        isfibonacciseries(num);
    }
    static void isfibonacciseries(int num){
        int f1=0,f2=1,f3=0;
        System.out.print(f1+","+f1",");
        for(int i=1;i<=num-2;i++){
        f3=f1+f2;
        }
    }
}
