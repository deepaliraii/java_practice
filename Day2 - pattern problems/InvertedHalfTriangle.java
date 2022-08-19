//Day2:- 18/08/2022
//Question- print inverted Half Triangle
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

public class InvertedHalfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i>j)
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
