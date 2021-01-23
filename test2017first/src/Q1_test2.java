public class Q1_test2 {
    public static void air(Node[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        mat[0][0].min= mat[0][0].max = 0;
        for (int i = 1; i < m; i++) {mat[0][i].min = mat[0][i].max =  mat[0][i-1].min + mat[0][i-1].right;}
        for (int i = 1; i < n; i++) {mat[i][0].min = mat[i][0].max = mat[i-1][0].min + mat[i-1][0].down;}


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mat[i][j].min = Math.min(mat[i-1][j].min +mat[i-1][j].down,mat[i][j-1].min +mat[i][j-1].right);
                mat[i][j].max = Math.max(mat[i-1][j].max +mat[i-1][j].down,mat[i][j-1].max +mat[i][j-1].right);
            }
        }



    }

}

class Node{
    int right;
    int down;
    int min;
    int max;

    public Node(int r , int d){
        this.right = r;
        this.down = d;
    }



}