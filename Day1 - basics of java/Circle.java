//Day 1 :- 17/08/2022
//Question :- write a program to calculate area of circle(take radius in float)

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        float radius=sc.nextFloat();
        System.out.println("The area of circle is : "+ (3.14*(radius*radius)));
        sc.close();
    }
}
