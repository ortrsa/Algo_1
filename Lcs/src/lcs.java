import java.util.Arrays;

public class lcs {
    public static void main(String[] args) {
        System.out.println(LcsString("adg","ar"));
    }


    public static String LcsString(String a , String b){
        int [][] mat = Lcs(a,b);
        int len = mat[a.length()][b.length()];
        String ans = "";
        int i = a.length();
        int j = b.length();
        while(len>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ans = a.charAt(i-1)+ans;
                len--;
                i--;
                j--;
            }
            else if(mat[i][j]==mat[i][j-1]){
                j--;
            }else i--;

        }

        return ans;
    }

    public static int[][] Lcs(String a , String b){
    int [][] mat = new int[a.length()+1][b.length()+1];


        for (int i = 1; i <a.length()+1 ; i++) {
            for (int j = 1; j < b.length()+1; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)){
                    mat[i][j] = mat[i-1][j-1] +1;
                }
                else{
                    mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
                }
            }
            System.out.println(Arrays.toString(mat[i-1]));
        }
        System.out.println(Arrays.toString(mat[a.length()]));
        return mat;
    }
}
