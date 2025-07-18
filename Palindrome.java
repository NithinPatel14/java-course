import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check a palindrome:  ");
        String firstinput = scanner.nextLine();  // Get the whole line as input

        String result = "";  // Empty string to store result string

        for (int i = firstinput.length() - 1; i >= 0; i--) {
            result = result + firstinput.charAt(i);  // Add each character in reverse order
        }

        // Check if the firstinput and result strings are the same
        if (firstinput.toLowerCase().equals(result.toLowerCase())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
