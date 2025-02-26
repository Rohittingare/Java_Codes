package org.example;
/*
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 50
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TripletSum {
    public static void main(String[] args) {

        /*
        input 1 2 3 4 5 6 7
        sum 12
        out 5
         */

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            input[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int count = 0;
        for(int i=0; i<len-2;i++){
            for (int j = i+1; j <len-1 ; j++) {
                for (int k = j+1; k <len ; k++) {
                    if(input[i]+input[j]+input[k]==sum){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


        //Java 8 implementation with streams
//        int[] input = IntStream.range(0,len).map(n->n=sc.nextInt()).toArray();
//       int sum = sc.nextInt();
//
//       long count = IntStream.range(0,len-2)
//               .mapToLong(i -> IntStream.range(i+1,len-1)
//                    .mapToLong(j->IntStream.range(j+1,len)
//                            .filter(k->input[i]+input[j]+input[k]==sum)
//                            .count())
//                       .sum())
//               .sum();
//        System.out.println(count);
    }
}
