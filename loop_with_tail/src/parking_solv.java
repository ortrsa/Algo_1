public class parking_solv {
    public static void main(String[] args) {
        car_list a = new car_list(2);
        car t = a.head;
        car r = a.head;
        System.out.println(findN(a));

    }


    public static boolean findN(car_list cars) {
        car t = cars.head;
        car r = cars.head;

        while (true) {
            if (t.next == null || r.next == null || r.next.next == null) return false;
            t = t.next;
            r = r.next.next;
            System.out.println(t +"  "+r);
            if (r.id == t.id) return true;

        }
    }

}

