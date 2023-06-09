import java.util.Random;

public class HW_1_Main {
    public static void main(String[] args) {


        // 1
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);
        int tmp = i;


        //2
        int n = 0;
        while (i != 1) {
            i >>= 1;
            n++;
        }
        System.out.println(n);


        // 3
        int counter_m1 = 0;
        int counter_m2 = 0;
        int filling_m1 = tmp;
        int filling_m2 = filling_m1;
        for (; tmp <= Short.MAX_VALUE; tmp++) {
            if (tmp % n == 0) {
                counter_m1 += 1;
            }
        }
        int[] m1 = new int[counter_m1];

        for (int j = 0; j < m1.length; filling_m1++) {
            if (filling_m1 % n == 0) {
                m1[j] = filling_m1;
                j++;
            }
        }


        // 4
        for (; i >= Short.MIN_VALUE; i--) {
            if (i % n != 0) {
                counter_m2 += 1;
            }
        }

        int[] m2 = new int[counter_m2];

        for (int j = 0; j < m2.length; filling_m2--) {
            if (filling_m2 % n != 0) {
                m2[j] = filling_m2;
                j++;
            }
        }
    }
}
