public class Q2_2test {
    public static void main(String[] args) {
        floor(13, new int[] {1,2,3,4,5,6,7,8,9,11,22,33,44,55});
    }

    public static void floor(int a , int[] arr){
        int jump =0 ;
        int floornum = arr.length;
        int tmp =0;
        while (floornum > tmp){
            jump++;
            tmp+=jump;
        }

        int step = jump -1;

        while(arr[jump]< a ){
            jump = jump+step;
            step = step-1;
        }

        System.out.println("1 breaks at : " + jump);
        int floor = jump - (step+1);
        while (arr[floor]<a){
            floor++;
        }
        System.out.println("floor = " + floor);

    }



}
