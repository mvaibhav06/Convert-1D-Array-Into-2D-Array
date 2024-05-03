public class ConvertToTwoDArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] out = new int[m][n];
        if(m*n != original.length){
            return new int[0][0];
        }
        int k = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                out[i][j] = original[k++];
            }
        }
        return out;
    }
}
