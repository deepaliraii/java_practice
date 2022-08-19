//Day2:- 18/08/2022
//Question :- print triangle pattern
/*
       Enter Rows : 
        6
        * * * * * * 
          * * * * *
            * * * *
              * * *
                * *
                  *
 */

import java.util.Scanner;

public class HalfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r=sc.nextInt();

        //Method-1
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=r-1;j>=0;j--)
        //     {
        //         if(j>i)
        //         {
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Method-2
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=r-i;j<=r;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
