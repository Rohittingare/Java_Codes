package org.example;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args){
        int[] arr = {9,9,9};

        int[] result = addOne(arr);

        System.out.println(Arrays.toString(result));

    }

    private static int[] addOne(int[] arr) {

        int len = arr.length;
        for (int i = len-1; i >=0; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] result = new int[len+1];
        result[0] = 1;
        return result;
    }
}
