import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int remainder=number1%number2;
        int quotient=number1/number2;
        System.out.println("quotient and remainder are "+quotient+" "+remainder);
        sc.close();
    }
}
