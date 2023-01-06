package problemPractice;
/*
 Q>Bob and alice play a game in which bob gives alice a chalenge to think of any number M between 1 to N .
      bob then tells alice a number X. alice has to confirm wether X is greater or smaller than number m or equal to 
      number M. this continues till bob finds the number correctly.
      your task is to find the maximum number of attempts bob needs to guess the number thought of by alice
      
 */

import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class BobAlice {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       ArrayList<Integer> primes = new ArrayList<Integer>();

       primes.add(2);

       for (int i = 3; i <= 100000; i+=2) {

           int sqrt = (int)Math.sqrt(i);

           boolean prime = true;

           for (int p : primes) {

               if (p > sqrt)

                   break;

               if (i%p==0) {

                   prime = false;

                   break;

               }

           }

            if (prime)

               primes.add(i);

       }

       int[] counts = new int[100001];

       int currIndex = 0;

       for (int i = 0; i <= 100000; i++) {

           if (currIndex < primes.size() && primes.get(currIndex) == i)

               currIndex++;

           counts[i] = currIndex;

       }

       int g = sc.nextInt();

       for (int i = 0; i < g; i++) {

           System.out.println(counts[sc.nextInt()]%2==0?"Bob":"Alice");

       }

   }

}
