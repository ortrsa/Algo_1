import java.util.Arrays;

public class Lis {
    public static int Lisnum(int[] Lis){
        int n = Lis.length;
        int list[] = new int[n];
        int k = 1;
        list[0]= Lis[0];
        for (int i = 1; i <n ; i++) {
            if(Lis[i]>list[k-1]) {
                list[k++] = Lis[i];

            }
            else {
                int bs = Arrays.binarySearch(list, 0, k, Lis[i]);
                if (bs < 0) {
                    bs = -bs -1;
                    list[bs] = Lis[i];
                }

            }
        }
        System.out.println(Arrays.toString(list));
        return k;
    }

    public static int[] Lis(int[] Lis){
        int n = Lis.length;
        int list[] = new int[n];
        int mat[][] = new int[n][n];
        int k = 1;
        list[0]= mat[0][0] = Lis[0];
        for (int i = 1; i <n ; i++) {
            if(Lis[i]>list[k-1]) {
                list[k] = mat[k][k] = Lis[i];
                for (int j = 0; j < k; j++) {
                    mat[k][j] = mat[k-1][j];
                }
                k++;
            }
            else {
                int bs = Arrays.binarySearch(list, 0, k, Lis[i]);
                if (bs < 0) {
                    bs = -bs -1;
                    list[bs] = mat[bs][bs] = Lis[i];
//                    for (int j = 0; j < bs; j++) {
//                        mat[bs][j] = mat[bs-1][j];
//                    }

                }

            }
        }

        return Arrays.copyOf(mat[k-1],k);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Lis(new int[]{0,2,4,6,8,10,3,5})));
    }
}
