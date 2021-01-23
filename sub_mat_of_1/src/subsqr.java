import java.util.Arrays;

public class subsqr {

    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1,1,1,0},
                {1,1,1,0},
                {1,1,1,0},
                {0,1,0,1}};
        subof1(mat);
    }

    public static void subof1(int[][] mat ){
        int n = mat.length;
        int max =0 ;
        int [][] mymat = new int[n][n];
        for (int i = 0; i < n; i++) {
            mymat[i][0] = mat[i][0];
            mymat[0][i] = mat[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(mat[i][j]==0) mymat[i][j] = 0;
                else {
                    mymat[i][j] = minof3(mymat[i-1][j-1],mymat[i-1][j],mymat[i][j-1])+1;
                    if(mymat[i][j]> max) max = mymat[i][j];
                }

            }
            System.out.println(Arrays.toString( mymat[i-1]));
        }
        System.out.println(Arrays.toString( mymat[n-1]));
        System.out.println(max);
    }

    public static int minof3(int a, int b ,int c){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        return min;
    }
}
