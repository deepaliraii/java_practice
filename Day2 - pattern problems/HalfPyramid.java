//Day2:-18/08/2022
//Question:- print half pyramid
/*
      Enter rows of pyramid : 
       6
       * 
       * *
       * * *
       * * * *
       * * * * *
       * * * * * *
 */
import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Method-1
        // System.out.println("Enter rows of pyramid : ");
        // int r=sc.nextInt();
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Method-2
        System.out.println("Enter Rows : ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i<j)
                System.out.print("  ");
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
