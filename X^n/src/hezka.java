public class hezka {
    public static int a(int x , int n){
        int ans = 1;
        while (n>0) {
            if (n % 2 == 1) {
                ans = x * ans;
            }
            x = x * x;
            n = n/2;
        }
        return ans;
    }

    public static int r(int x , int n){
        if(n==0) return 1;
        if (n%2==0){
            return r(x*x, n/2);
        }
        return x*r(x*x,n/2);
    }

    public static int[][] matrixmul(int [][] a , int[][] b){
        int[][] mata = new int[2][2];
        mata[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0];
        mata[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1];
        mata[1][0] = a[1][0]*b[0][0] + a[1][1]*b[1][0];
        mata[1][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1];
        return mata;
    }

    public static int fib(int n){
        if(n==1 || n ==2) return 1;
        int[][] res = {{1,1},{1,0}};
        int[][] A = {{1,1},{1,0}};
        n=n-2;
        while (n!=0) {
            if (n % 2 == 1) {
                res = matrixmul(res, A);
            }
            A = matrixmul(A, A);
            n = n / 2;
        }
        return res[0][0];
    }

    public static int[][] rfib(int mat[][],int n){
        if (n==0)return new int[][] {{1,1},{1,0}};
        if(n%2==0){
            return rfib(matrixmul(mat,mat),n/2);
        }
        return matrixmul(mat,rfib(matrixmul(mat,mat),n/2));

    }
    public static int rfibh(int n){
        int res [][] = rfib(new int[][] {{1,1},{1,0}},n-2);

        return res[0][0];
    }
}
