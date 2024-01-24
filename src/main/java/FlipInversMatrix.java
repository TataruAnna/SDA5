public class FlipInversMatrix {
    //Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
    //To flip an image horizontally means that each row of the image is reversed.
    //
    //For example, flipping [1,1,0] horizontally results in [0,1,1]. To invert an image means that each 0 is replaced by 1,
    // and each 1 is replaced by 0.
    //
    //For example, inverting [0,1,1] results in [1,0,0].

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 0, 1, 1}
        };
        int[][] result = invertMatrix(flipMatrix(matrix));

        for (int i = 0; i < result.length ; i++) {
            for(int j = 0;j< result.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static  int[][] flipMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i<n;i++){
            for(int j=n-1;j>=0;j--){
                result[i][n-1-j]=matrix[i][j];
            }
        }

        return result;
    }
    public static  int[][] invertMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i<n;i++){
            for(int j= 0;j<n;j++){
                if(matrix[i][j]==0){
                    result[i][j]=1;
                }
                if(matrix[i][j]==1){
                    result[i][j]=0;
                }
            }
        }
        return result;
    }

}
