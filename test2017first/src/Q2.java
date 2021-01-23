import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        Lis(new int[]{1,11,2,10,4,5,2,1});
    }
    public static void Lis(int [] list){
        int n = list.length;
        int [] h = new int[n];
        int [][] mat = new int[n][n];
        int count =1;
        h[0] = mat[0][0] = list[0];
        for (int i = 1; i < n; i++) {
            int index = Arrays.binarySearch(h , 0 , count , list[i]);
            if(index< 0 ){
                index = -index -1;
                h[index] = mat[index][index] = list[i];

                for (int j = 0; j < index; j++) {
                    mat[index][j] = mat[index-1][j];
                }
                if(count <= index)
                    count++;

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));

        }

    }


}
