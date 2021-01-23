public class Q3 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n){
        int [][] A = new int[][] {{1,1},{1,0}};
        int [][] x = new int[][] {{1,1},{1,0}};

        n = n-2;
        while (n>0){
            if(n%2==1){
                    A = mult(A,x);
            }
            x = mult(x,x);
            n=n/2;
        }

        return A[0][0];
    }


    public static int[][] mult(int[][] a , int[][] b){
        int[][] res = new int[2][2];

                res[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0];
                res[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1];
                res[1][0] = a[1][0]*b[0][0] + a[1][1]*b[1][0];
                res[1][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1];

        return res;


    }


}
