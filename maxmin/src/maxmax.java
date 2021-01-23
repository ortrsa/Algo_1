import java.util.Stack;

public class maxmax {
    public static void main(String[] args) {
       int [] arr = {1,22,3,44,3,5,7,4,234,6,567,234,6456,234,6324,6,7,0};
        sent_to_node( arr);
    }

    public static void sent_to_node(int[] arr){
        Node[] ans = new Node[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ans[i] = new Node(arr[i]);
        }
        int max1index = maxmax(ans , 0, arr.length-1);
        int max2 = ans[max1index].st.pop();
        while (!ans[max1index].st.empty()){
            int temp = ans[max1index].st.pop();
            if(temp>max2){
            max2= temp;
            }
        }


        System.out.println("max 1 = " + ans[max1index].key);
        System.out.println("max 2 = " + max2);
    }

    public static int maxmax(Node[] arr , int low, int high){
        if(low<high){
            int mid = (low + high)/2;
            int i = maxmax(arr,low,mid);
            int j = maxmax(arr, mid+1 , high);
            if(arr[i].key > arr[j].key){
                arr[i].st.push(arr[j].key);
                return i;
            }
            else {
                arr[j].st.push(arr[i].key);
                return j;
            }

        }
        else return low;

    }


}
class Node{
    int key;
    Stack<Integer> st;
    public Node(int key){
        this.key = key;
        this.st = new Stack<>();
    }
}
