import java.util.Arrays;

public class tlat {

    public static void main(String[] args) {
        game(10000);
    }

    public static void game(int num){
        double pa =1 , pb = 0.8, pc = 0.5;
        int counta = 0 , countb = 0 , countc = 0;
        int a=1,b=2,c=3;
        double bC =0 , cC = 0;
        for (int i = 0; i < num; i++) {

            int[] q = getQ();
            int first = q[1];

        switch (first){
            case 1: // a start, kill b.
                cC = Math.random();
                if(cC < pc) countc++;
                else counta++;
                break;

            case 2: // b start , try kill a.
                bC = Math.random();
                if(bC < pb) { // b kill a. dual = b-c.
                    boolean flag = true;
                    while (flag){
                        cC = Math.random();
                        if(cC < pc){ // c kill b
                            countc ++;
                            flag = false;
                        }
                        else { //c miss
                            bC = Math.random();
                            if(bC < pb){
                                countb++;
                                flag = false;
                            }
                        }
                    }
                }
                // b miss.
                else if(q[2] == a) { // a turn. kill b , c turn
                    cC = Math.random();
                    if(cC < pc) countc++;
                    else counta++;
                }
                else if(q[2]== c){ // fire to the air.
                    // a kill B
                    cC = Math.random();
                    if(cC < pc) countc++;
                    else counta++;
                }
                break;

            case 3:
                if(q[2] == a){
                    cC = Math.random();
                    if(cC < pc) countc++;
                    else counta++;
                }
                else{
                    if(q[2] == b){
                        bC = Math.random();
                        if(bC < pb) { // b kill a. dual = b-c.
                            boolean flag = true;
                            while (flag){
                                cC = Math.random();
                                if(cC < pc){ // c kill b
                                    countc ++;
                                    flag = false;
                                }
                                else { //c miss
                                    bC = Math.random();
                                    if(bC < pb){
                                        countb++;
                                        flag = false;
                                    }
                                }
                            }
                        }
                       else{
                           //a kill b
                            cC = Math.random();
                            if(cC < pc) countc++;
                            else counta++;
                        }

                    }
                }
                break;
        }
        }
        double proba = (double)counta/num;
        double probb = (double)countb/num;
        double probc = (double)countc/num;

        System.out.println(proba);
        System.out.println(probb);
        System.out.println(probc);
    }



    public static int[] getQ (){
        int[] Q = {0, 1, 2, 3};
        for (int i = 1; i < Q.length; i++) {
            int j = (int) (Math.random() * 3) + 1;
            int t = Q[i];
            Q[i] = Q[j];
            Q[j] = t;
        }
     return Q;
    }

}
