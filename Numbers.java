import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Number");
        num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {        
            for (int j = 1; j<=i; j++){
                System.err.print(j);
            }
            System.out.println();             
        }
    }
}
