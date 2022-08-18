import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number :");
        int num=sc.nextInt();
        while(num>0){
            System.out.print(num%10);
            num=num/10;
        }
        sc.close();
    }
}
