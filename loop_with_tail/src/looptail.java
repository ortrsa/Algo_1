public class looptail {
    public car head;

    public looptail(int n , int m) {
        if (n <= 0) throw new IllegalArgumentException();
        car first = new car(true);
        car next = first;
        for (int i = 1; i < n; i++) {

            car nextcar = new car(false);
            next.setNext(nextcar);
            next = nextcar;
        }
        next.setNext(first);
        first.setPrv(next);

        //tail

        int i =1;
        car start = new car(false);
        car newnext = start;
        while (i<m){
            car nexttail = new car(false);
            newnext.setNext(nexttail);
            newnext = nexttail;
            i++;
        }
        newnext.setNext(first);
        this.head = start;
    }
}
