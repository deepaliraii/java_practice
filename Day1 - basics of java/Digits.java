//Day1 :- 17/08/2022
//Question:- write a program to find digits of given number
import java.util.Scanner;

public class Digits{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        System.out.println("number of digits in given number is : " + ((int)Math.log10(number)+ 1));
        sc.close();
    }
}