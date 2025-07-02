public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {2,3,5,3,1,9,7};
        for (int n: arr){
            System.out.print(n+ " ");
        }
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
    
}
