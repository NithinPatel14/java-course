import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        num = scanner.nextInt();
        if (num %4 == 0 && num % 100 != 0 || num % 400 == 0){
            System.out.println("It is a Leap year");
        }
        else{
            System.out.println("It is not a Leap year");
        
        }
    }
    
}
