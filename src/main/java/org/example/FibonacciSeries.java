package org.example;

public class FibonacciSeries {
    //for n = 10 output : 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        int a = 0, b= 1;
        System.out.print(a+" "+b+" ");
        int n = 10;
        for (int i = 0; i < n - 2; i++) {

            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
