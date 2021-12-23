package pl.akademia108;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] lotto = new int[6];
        Random random = new Random();
        int randomnum = random.nextInt(49 - 1 + 1) + 1;
        for (int i=0; i < lotto.length; i++) {
            for (int x = 0; x < i; x++) {
                if (lotto[x] == randomnum) {
                    randomnum = random.nextInt(49 - 1 + 1) + 1;
                    x = -1;
                }
            }
            lotto[i] = randomnum;
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}