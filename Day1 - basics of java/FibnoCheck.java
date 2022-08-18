//Day1:- 17/08/2022
//Question:- Check whether given number lies in fibnocci series or not
// Ex:- 0 1 1 2 3 5 8 13 21    
//  3 -> Yes  , 7 -> No

import java.util.Scanner;

public class FibnoCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int n1=0;
        int n2=1;
        while(true){
           if(n1==num || n2==num)
           {
            System.out.println("YES");
            break;
           }
           else{
            if(n1>num &&n2>num)
           { System.out.println("No");
            break;
           }
            else
          { int sum=n1+n2;
            n1=n2;
            n2=sum;
            continue;
          }
        }
    }
        sc.close();
    }
}
