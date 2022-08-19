// Day2:- 18/08/2022
// Question:- write a program to print floyd's triangle
/*
      Enetr Rows:-
      6
      1 
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15 
      16 17 18 19 20 21
 */
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Rows:-");
        int r=sc.nextInt();
        int count=1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
