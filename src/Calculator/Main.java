package Calculator;


/*  errors - x
    warnings - y
    x - 1 = x + 1
    x - 2 = null
    y - 1 = y + 2
    y - 2 = x + 1
 */

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {3,5,20,8,7,3,100};
        System.out.println(Arrays.toString(printOddNumbers(arr)));
    }

    public static String[] printOddNumbers(int[] arr) {
        String[] copy = new String[arr.length];
        for (int i = 0,j = 0;i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                copy[j] = Arrays.toString(new int[]{arr[i]});
                j++;
            }
        }
        return copy;
    }

}
