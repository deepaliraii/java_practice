// Day2 :- 18/08/2022
//Question :- print solid rectangle
/*   Enter size of rows : 
     5
     Enter size of coloumns : 
     4
     * * * * 
     * * * *
     * * * *
     * * * *
     * * * *
 */

import java.util.Scanner;

public class SolidRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of rows : ");
        int n1=sc.nextInt();
        System.out.println("Enter size of coloumns : ");
        int n2=sc.nextInt();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print("* ");
            }System.out.println();
        }
        sc.close();
    }
}
