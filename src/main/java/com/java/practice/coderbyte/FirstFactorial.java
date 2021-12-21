package com.java.practice.coderbyte;

public class FirstFactorial {
    public static void main(String[] args) {
        System.out.println(FirstFactorial.findTheFirstFactorial(4));
    }

    public static int findTheFirstFactorial(int num) {
        // code goes here  
        int temp = 1;
      for (int i = 1; i < num+1; i++) {
           temp*=i;
      }
        return temp;
      }
}
