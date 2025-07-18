public class ProductOfTwoMatrix {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3}, {3,2,4}, {5,6,4}};
        int [][] arr2 = {{1,4,3}, {2,7,4}, {2,6,9}};
        int [][] product = new int [3][3];
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr1[i].length; j++){
                for (int k = 0; k<arr1[i].length; k++)
                     product[i][j] += arr1[i][k] * arr2[k][j];

                } 
            }
         for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr1[i].length; j++){
               System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
