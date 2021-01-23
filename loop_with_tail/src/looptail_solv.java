public class looptail_solv {
    public static void main(String[] args) {
        looptail map = new looptail(14,18);
        findmn(map);
    }

    public static void findmn (looptail map){
        if (map.head == null) return ;
        car t = map.head;
        car r = map.head;

        int m = 0;
        int n = 0;

        while(true){
            if (t.next == null || r.next == null || r.next.next == null) return ;
            t = t.next;
            r = r.next.next;

            if(t.id == r.id) break;
        }
        car tt = map.head;
        while (t.id != tt.id){
            t = t.next;
            tt = tt.next;
            m++;

        }
        while (true){

            t =t.next;
            n++;
            if(tt.id == t.id) break;

        }

        System.out.println(m);
        System.out.println(n);


    }


}
