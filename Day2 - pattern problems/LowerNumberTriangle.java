//Day2:- 18/08/2022
//Question:- print lower number triangle
/*
       Enetr Rows:-
       6
       1 2 3 4 5 6 
       1 2 3 4 5
       1 2 3 4
       1 2 3
       1 2
       1
 */
import java.util.Scanner;

public class LowerNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Rows:-");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r-i;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
