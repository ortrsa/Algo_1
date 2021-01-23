public class Q1 {
    public static void main(String[] args) {
        Q1a(new int[][]{
                {0,0,1,0,1},
                {0,1,1,1,1},
                {1,1,1,1,0},
                {0,1,1,1,1},
                {0,0,1,1,1}
        });
    }

    public static int min3 (int a , int b, int c){
        int min = a;
        if(min > b) min = b ;
        if(min > c ) min = c;

        return min;
    }

    public static void Q1a(int [][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int max = 0;
        int countOf2 =0;
        int [][] h = new int[n][m];
        for (int i = 0; i < m; i++) { h[0][i] = mat[0][i]; }
        for (int i = 0; i < n; i++) { h[i][0] = mat[i][0]; }

        for (int i = 1; i < n; i++) { // n*m
            for (int j = 1; j < m; j++) {
                if(mat[i][j] == 1 ){
                 h[i][j] = min3(h[i-1][j-1],h[i-1][j],h[i][j-1]) + 1;
                 if(h[i][j]>max) max =h[i][j];
                 if(h[i][j] >= 2) countOf2++;
                }
            }
        }
        System.out.println(max*max);
        System.out.println(countOf2);
    }
}
