public class parking_solv {
    public static void main(String[] args) {
        car_list a = new car_list(-5);
        car t = a.head;
        System.out.println(findN(a));

    }



    public static int findN(car_list cars){
        car temp = cars.head.next;
        int count =1 ;
        while (true){
            if(temp.mark) {
                temp.mark = false;
                int i = count;
                while (i > 0) {
                    temp = temp.prv;
                    i--;
                }
                if(!temp.mark) return count;
                else {
                    temp = cars.head.next;
                    count =1 ;
                }
            }
            else {
                temp = temp.next;
                count++;
            }

        }

    }
}
