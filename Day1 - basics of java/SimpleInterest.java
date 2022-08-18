//Day1 :- 17/08/2022
// Question:- write a program to calculate simple interest

import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter princile amount , rate, time(in years) respectively:");
        float principleAmount=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();

        float sI=(principleAmount*rate*time)/100;
        System.out.println("The calculated simple interest is : " + sI);

        sc.close();
    }
}