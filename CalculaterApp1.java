import java.util.Scanner;

public class CalculaterApp1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  first number");
        num1 = scanner.nextInt();

        System.out.println("Choose the operator");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter a second number");
        num2 = scanner.nextInt();
        
        double number;
        switch (operator){
            case '+' :
               number = num1 + num2;
               System.out.println(" Addtion = " + number);
               break;
            
            case '-' :
                number = num1 - num2;
                System.out.println(" Subraction = " +number);
                break;

            case '*' :
               number = num1 * num2;
               System.out.println(" Multiplication = " + number);
               break;

            case '/' :
               number = num1 / num2;
               System.out.println(" Division = " + number);
               break;
               
            default :
               System.out.println("Enter a correct value");

        }
    }
    
}
