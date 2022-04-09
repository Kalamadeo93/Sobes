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
        int[] arr = {-7,-5,-2,0,1,5,9};
        int[] arr1 = {-4,-1,2,4,8};
        System.out.println(Arrays.toString(mergeArrays(arr, arr1)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int a = a1.length;
        int b = a2.length;
        int c = a + b;
        int[] copy = new int[c];
        int i = 0,j = 0,k = 0;
        while (i < a && j < b) {
            int n = a1[i];
            int m = a2[j];
            if (n > m) {
                copy[k] = m;
                j++;
                k++;
            } else if (m > n) {
                copy[k] = n;
                i++;
                k++;
            }
        }
        while(i < a) {
            copy[k] = a1[i];
            k++;
            i++;
        }
        while(j < b) {
            copy[k] = a2[j];
            k++;
            j++;
        }
        return copy;
    }

}
/*if (a != 0){
                if (a > b) {
                    while (i < a && j < b) {
                        int n = arr[i]; // n = arr[0] = 0
                        int m = arr1[j]; // m = arr1[0] = 6
                        if (n > m) {// 0 > 6 // not true
                            copy[k] = m;
                            j++;
                            count++;
                        } else if (m > n) { // 6 > 0 //true
                            copy[k] = n;
                            i++;
                            count++;// copy[0] = 0
                        }
                        k++;
                    }
                    while(i < a) {
                        copy[k] = arr[i];
                        k++;
                        i++;
                        count++;
                    }
                    while(j < b) {
                        copy[k] = arr[j];
                        k++;
                        j++;
                        count++;
                    }
                }
            } else if (b != 0) {

            }*/
