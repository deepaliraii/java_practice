// Day1:-17/08/2022
//Question:- write a program to calculate factorial of a given number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int factorial=1;
        while(num>0){
            factorial=factorial*(num);
            num--;
        }
        System.out.println("Factorial of given number is : "+ factorial);
        sc.close();
    }
}
