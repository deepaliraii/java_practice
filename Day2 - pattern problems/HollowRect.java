//Day2:- 18/08/2022
//Question:- print hollow rectangle

/*
       Enter size of rows and coloumns
        5
        8
        * * * * * * * * 
        *             *
        *             *
        *             *
        * * * * * * * *
 */

import java.util.Scanner;

public class HollowRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of rows and coloumns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1)
                {
                    System.out.print("* ");
                }
                else{
                    if(j==0 || j==c-1){
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
