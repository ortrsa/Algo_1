public class car {
    static int count = 1;
    int id;
    public boolean mark;
    public car next;
    public car prv;
    public car(boolean Mark){
        this.mark = Mark;
        this.id = count;
        count++;

    }

    public void setNext(car next) {
        this.next = next;
    }
    public void setPrv(car prv){
        this.prv = prv;
    }

    @Override
    public String toString() {
        return "car{" +
                "mark=" + mark +
                ", id=" + id  +
                '}';
    }
}
