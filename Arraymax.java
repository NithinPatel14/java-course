import java.util.Scanner;

public class Arraymax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size of an arry");
        int n = scanner.nextInt();
        int arr[] =new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("enter a value" + (i+1));
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (max< arr[i] ){
                max = arr[i];
            }
             else if (min > arr[i]){
                min = arr[i];
            }
        } 
         System.out.println( "maximum value " + max);
         System.out.println("minimum value " + min);
    }
}
