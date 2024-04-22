package arrayprograms ;

 public class create_twod_array{
    public static void main(String[] args) {
        int[][] arr = {{1,4, 7 } , {78 , 89 , 90}, {45, 89 , 37}};
        System.out.println("Values in the 2D array");
        System.out.println("length of the array = "+arr.length);

        for (int i = 0 ; i < arr.length ; i++)//outer loop , here i iterates over the row of the array 
        {
            for (int j = 0 ; j < arr[i].length ; j++)
            //inner loop , iterates over the each column of the current row i
            {
                System.out.print(arr[i][j]+ " ");
            }
           System.out.println();
        }
    }
 }