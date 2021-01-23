public class main {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 1, 3, 6};
        //smart(a);
        very_smart(a);
    }

    public static void greedy(int[] a) {
        int turn = 0;
        int res1 = 0;
        int res2 = 0;
        int pointer1 = 0;
        int pointer2 = a.length - 1;
        int temp = 0;
        while (pointer2 >= pointer1) {
            if (a[pointer1] > a[pointer2]) {
                temp = a[pointer1];
                pointer1++;
            } else {
                temp = a[pointer2];
                pointer2--;
            }
            if (turn % 2 == 0) {
                res1 += temp;
            } else {
                res2 += temp;
            }
            turn++;
        }

        System.out.println("player 1 scour is:" + res1);
        System.out.println("player 2 scour is:" + res2);

    }

    public static void smart(int[] a) {
        int turn = 0;
        int res1 = 0;
        int res2 = 0;
        int pointer1 = 0;
        int pointer2 = a.length - 1;
        int temp = 0;
        int oddsum = 0;
        int evensum = 0;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                evensum += a[i];
            } else {
                oddsum += a[i];
            }
        }

        if (evensum < oddsum) {
            flag = true;
        }
        while (pointer1 <= pointer2) {
            if (flag) {
                if (turn % 2 == 0) {
                    if (pointer1 % 2 != 0)
                        res1 += a[pointer1++];
                    else
                        res1 += a[pointer2--];

                } else {
                    if (a[pointer1] > a[pointer2]) res2 += a[pointer1++];
                    else res2 += a[pointer2--];


                }
            } else {
                if (turn % 2 == 0) {
                    if (pointer1 % 2 == 0)
                        res1 += a[pointer1++];
                    else
                        res1 += a[pointer2--];

                } else {
                    if (a[pointer1] > a[pointer2]) res2 += a[pointer1++];
                    else res2 += a[pointer2--];

                }

            }
            turn++;
        }
        System.out.println(res1);
        System.out.println(res2);

    }

    public static void very_smart(int[] a) {
        int turn = 0;
        int res1 = 0;
        int res2 = 0;
        int pointer1 = 0;
        int pointer2 = a.length - 1;
        int temp = 0;
        int oddsum = 0;
        int evensum = 0;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                evensum += a[i];
            } else {
                oddsum += a[i];
            }
        }


        while (pointer1 <= pointer2) {
            if (turn % 2 == 0) {
                if (evensum < oddsum) {
                    flag = true;
                } else if (evensum == oddsum){
                    if(a[pointer1]>a[pointer2]){
                        if(pointer1%2==0)flag = false;
                        else flag =true;
                    }else {
                        if(pointer2%2==0)flag = false;
                        else flag =true;
                    }
                }
                else{
                    flag = false;
                }
            }
            if (flag) {
                if (turn % 2 == 0) {
                    if (pointer1 % 2 != 0) {
                        res1 += a[pointer1];
                        System.out.println(pointer1);
                        oddsum -= a[pointer1++];

                    } else {
                        res1 += a[pointer2];
                        System.out.println(pointer2);
                        oddsum -= a[pointer2--];

                    }

                } else {
                    if (a[pointer1] > a[pointer2]) {
                        res2 += a[pointer1];
                        System.out.println(a[pointer1]);
                        evensum -= a[pointer1++];
                    } else {
                        res2 += a[pointer2];
                        System.out.println(a[pointer2]);
                        evensum -= a[pointer2--];
                    }

                }
            } else {
                if (turn % 2 == 0) {
                    if (pointer1 % 2 == 0) {
                        evensum -= a[pointer1];
                        System.out.println(pointer1);
                        res1 += a[pointer1++];
                    } else {
                        evensum -= a[pointer2];
                        System.out.println(pointer2);
                        res1 += a[pointer2--];
                    }

                } else {
                    if (a[pointer1] > a[pointer2]) {
                        oddsum -= a[pointer1];
                        System.out.println(a[pointer1]);
                        res2 += a[pointer1++];

                    } else {
                        oddsum -= a[pointer2];
                        System.out.println(a[pointer2]);
                        res2 += a[pointer2--];
                    }

                }

            }
            turn++;
            System.out.println(evensum + "  " + oddsum);
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
