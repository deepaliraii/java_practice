//Day1 :- 17/08/2022
//Question :- make simple calculator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        float number1=sc.nextFloat();
        float number2=sc.nextFloat();
        System.out.println("Enter operation to be performed(+,-,/,*) : ");
        String operator=sc.next();
        switch(operator){
            case "+": System.out.println("you have choosed addition, result is : " + (number1+number2));
            break;
            case "-":System.out.println("you have choosed substraction, result is : "+ (number1-number2));
            break;
            case "*":System.out.println("you have choosed multiplication, result is : "+ (number1*number2));
            break;
            case "/":System.out.println("you have choosed division, ");
             if(number2==0)
             {System.out.println("cannot be divided");
             break;}
             else
             {
                System.out.println(" result is : "+(number1/number2));
                break;
             }
             default: System.out.println("wrong operator");
        }
        sc.close();
    }
}
