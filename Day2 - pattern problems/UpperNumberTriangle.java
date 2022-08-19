//Day2:-18/08/2022
//Question :- print upper triangle with numbers
/*
      Enter rows:-
       6
       1 
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
       1 2 3 4 5 6
 */
import java.util.Scanner;

public class UpperNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:-");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
