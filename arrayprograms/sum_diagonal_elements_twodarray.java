//here , we will create the sum of the diagonal elements of the two dimensional array

package arrayprograms;

public class sum_diagonal_elements_twodarray{
    public static void main(String[] args) {

        int[][] arr = {{1,4,6} , {36,89,90} , {89, 90, 81}};

        //we are going to find the sum of right diagonal elements 
        int right_diagonal_sum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length; j++){
                if(i == j){
                    right_diagonal_sum += arr[i][j] ;
                }
            }}
            System.out.println("The right diagonal element sum is :"+right_diagonal_sum);

            //we are going to find the sum of left diagonal elements 
        int leftDiagonalSum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            // Sum the elements where row index equals column index
            leftDiagonalSum += arr[i][arr.length - 1 - i];
        }

            
            
            
            System.out.println("The left diagonal element sum is :"+leftDiagonalSum);
                


            }
        }
    
