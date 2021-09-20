/**
 *
 * Java 1. Homework 3
 *
 * @author Sarana Uskeeva
 * @version 20.09.2021
 */

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonalArray();
        fillArray(2,4);
    }
    static int[] invertArray() {
        int[] arr = {1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        }
        return arr;
    }
    static void fillArray () {
        int [] arr = new int[100];
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    static int[] changeArray () {
        int a;
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for ( int i = 0; i < arr.length; i++) {
            a = arr[i];
            arr[i] = a < 6 ? a * 2 : a;
            System.out.println(arr[i]);
        }
        return arr;
    }
    static void fillDiagonalArray () {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static int[] fillArray (int len, int initialValue) {
        int arrOne[] = new int[len];
        for (int i = 0; i < arrOne.length; i++){
            arrOne[i] = initialValue;
        }
        return arrOne;
    }
}


