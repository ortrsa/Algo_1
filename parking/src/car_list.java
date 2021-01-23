public class car_list {

    public car head;

    public car_list(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        car first = new car(true);
        car next = first;
        for (int i = 1; i < n; i++) {
            boolean rand;
            if (Math.random() > 0.5) rand = true;
            else rand = false;
            car nextcar = new car(rand);
            nextcar.setPrv(next);
            next.setNext(nextcar);
            next = nextcar;
        }
        next.setNext(first);
        first.setPrv(next);
        this.head = first;
    }

    @Override
    public String toString() {
        return "" + this.head;
    }
}
