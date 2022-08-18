//Day1:- 17/08/2022
//Question :- calculate the below series based on n
        //    1! + 2! + 3! + 4! + -------+ n!
import java.util.Scanner;

public class FactSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number :");
        int num=sc.nextInt();
        int sum=0;
        while(num>0)
        {
            int product=1;
            for(int i=1;i<=num;i++)
            {
               product=product*i;
            }
            // System.out.print(product + " ");
            sum=sum+product;
            num--;
        }
        // System.out.println();
        System.out.println(sum);
        sc.close();
    }
}
