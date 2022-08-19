//Day2:- 18/08/2022
//Question:- print inverted half pyramid

/*
      Enter rows of pyramid : 
       5
       * * * * * 
       * * * *
       * * *
       * *
       *
 */
import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows of pyramid : ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=r-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
