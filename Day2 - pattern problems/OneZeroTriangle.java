//Day2:-18/08/2022
//Question:-print One Zero pattern
/*
       Enter rows:-
       6
       1 
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1 
       0 1 0 1 0 1
 */
import java.util.Scanner;

public class OneZeroTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:-");
        int r=sc.nextInt();
        int temp;
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            temp=1;
            else
            temp=0;
            for(int j=0;j<=i;j++){
                  System.out.print(temp+" ");
                  if(temp==0)
                  temp++;
                  else
                  temp--;
            }
            System.out.println();
        }
        sc.close();
    }
}
