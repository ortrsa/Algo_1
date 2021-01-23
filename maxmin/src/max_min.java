public class max_min {

    public static void main(String[] args) {
        maxmin(new int[] {8,6,4,6,9,23,6,8,1,7,60,3,-1,89,0,43,2,3,45,7});
    }

    public static void maxmin(int [] arr){
       int max =0;
       int min = 0;
        if(arr[0]<arr[1]){
            max = arr[1];
            min = arr[0];}
        else {
            min = arr[1];
            max = arr[0];
        }
        for (int i = 2; i < arr.length; i +=2) {
            if(i == arr.length-1) i--;
            if(arr[i]< arr[i+1]){
                if(arr[i]<min) min = arr[i];
                if(arr[i+1]>max) max = arr[i+1];
            }
            else{
                if(arr[i]>max) max = arr[i];
                if(arr[i+1]<min) min = arr[i+1];
            }

        }

        System.out.println(max);
        System.out.println(min);

    }
}
