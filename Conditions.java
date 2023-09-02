import java.util.*;
public class Conditions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the 2 numbers: "); 
        int a =sc.nextInt();
        int b =sc.nextInt();

        sc.nextLine();


        System.out.println("Enter operator  (+,-,*,%): "); 
        String operator = sc.next();


        switch (operator)
        {
            case "+":
                System.out.printf("Sum : %d ",a+b);
                break;
            case "-":
                System.out.printf("Diff : %d ",a-b);
                break;
            case "*":
                System.out.printf("Prod : %d ",a*b);
                break;
            case "%":
                System.out.printf("Remainder : %d ",a%b);
                break;
            default:
                System.out.println("Invalid Operation");

        }




    }
}
