Compare Using == Operator
The == operator compares two arrays based on the reference, if both arrays contain a similar reference then they are equal.

public class CompareArray {
  
  // main method
  public static void main(String[] args) {
    // declare and initialize arrays
    int arr1[] = {10,20,30,40,50};
    int arr2[] = arr1;
    int arr3[] = {10,20,30,40,50};
    int arr4[] = {15,25,35,45,55};
    
    // compare arrays using == operator
    // compare arr1 and arr2
    if(arr1 == arr2)
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(arr1 == arr3)
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(arr1 == arr4)
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
}
Output:-

arr1 & arr2 are same
arr1 & arr3 are not same
arr1 & arr4 are not same

Limitation with == operator:- For reference data types, the == operator compare only reference not the value or content. To solve this problem equals() method came into the picture. We had discussed these points in details in their respective post:- equals() method in Java and == vs equals() in Java.

The equals() method of the Object class also compare two objects based on their reference. If we want to compare two objects based on their values then we must override the equals() method.

Luckily, Java has a pre-defined Arrays class in java.util package and contains several methods to solve common problems related to arrays. It contains several equals() methods to compare different types of values. These are,

public static boolean equals(byte[] a, byte[] a2)
public static boolean equals(int[] a, int[] a2)
public static boolean equals(short[] a, short[] a2)
public static boolean equals(long[] a, long[] a2)
public static boolean equals(char[] a, char[] a2)
public static boolean equals(double[] a, double[] a2)
public static boolean equals(float[] a, float[] a2)
public static boolean equals(boolean[] a, boolean[] a2)
public static boolean equals(Object[] a, Object[] a2)
public static boolean equals(T[] a, T[] a2, Comparator cmp)
Additional to the equals() method it also contains deepEquals() method, prototype:- public static boolean deepEquals(Object[] a1, Object[] a2)

Compare Two Arrays in Java using Arrays.equals()
The equals() method of the Arrays class compare arrays based on their content or values. The Arrays.equal() method return true if the two specified arrays are equal with each other. We have already listed the equals() method given in the Arrays class. Now, let us see the Java program to compare two arrays using the Arrays.equals() method.

import java.util.Arrays;

public class CompareArray {
  
  // main method
  public static void main(String[] args) {

    // declare and initialize arrays
    int arr1[] = {10,20,30,40,50};
    int arr2[] = arr1;
    int arr3[] = {10,20,30,40,50};
    int arr4[] = {15,25,35,45,55};
    
    // compare arrays using Arrays.equals() method
    // compare arr1 and arr2
    if(Arrays.equals(arr1, arr2))
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(Arrays.equals(arr1, arr3))
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(Arrays.equals(arr1, arr4))
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
}
Output:-

arr1 & arr2 are same
arr1 & arr3 are same
arr1 & arr4 are not same

Limitation of Arrays.equals() method:- It can compare only one-dimensional arrays. It can’t compare multidimensional arrays. Let us demonstrate it through a program.

// limitation of Arrays.equals()
import java.util.Arrays;

public class CompareArray {
  
  // main method
  public static void main(String[] args) {
    // declare and initialize 2D arrays
    int arr1[][] = {{50,60},{70,80},{90,100}};
    int arr2[][] = arr1;
    int arr3[][] = {{50,60},{70,80},{90,100}};
    int arr4[][] = {{55,66},{77,88},{99,100}};
    
    // compare arrays using Arrays.equals() method
    // compare arr1 and arr2
    if(Arrays.equals(arr1, arr2))
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(Arrays.equals(arr1, arr3))
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(Arrays.equals(arr1, arr4))
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
}
Output:-

arr1 & arr2 are same
arr1 & arr3 are not same
arr1 & arr4 are not same

In this program, arr1 and arr3 contain the same array elements but since the Arrays.equals() method is not able to compare multidimensional arrays, therefore, we got the wrong results. To solve this problem, we need to use Arrays.deepEquals() method.
Compare Two Arrays in Java using Arrays.deepEquals()
It returns true if the two specified arrays are deeply equal to each other. This method is appropriate for use with nested arrays of arbitrary depth.

Two array references are considered deeply equal,

If both are null, or
If they refer to arrays that contain the same number of elements and all corresponding pairs of elements in the two arrays are deeply equal.
The method declaration of deepEquals() is:- public static boolean deepEquals(Object[] a1, Object[] a2)

Now, let us see the Java program to compare 2 two-dimensional (2D) arrays using the Arrays.deepEquals() method.
import java.util.Arrays;

public class CompareArray {
  
  // main method
  public static void main(String[] args) {
    // declare and initialize 2D arrays
    int arr1[][] = {{50,60},{70,80},{90,100}};
    int arr2[][] = arr1;
    int arr3[][] = {{50,60},{70,80},{90,100}};
    int arr4[][] = {{55,66},{77,88},{99,100}};
    
    // compare arrays using Arrays.equals() method
    // compare arr1 and arr2
    if(Arrays.deepEquals(arr1, arr2))
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(Arrays.deepEquals(arr1, arr3))
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(Arrays.deepEquals(arr1, arr4))
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
}
Output:-

arr1 & arr2 are same
arr1 & arr3 are same
arr1 & arr4 are not same

Note:- Arrays.deepEquals() method can compare only multidimensional array, not the single dimensional array.

Arrays.deepEquals() method is able to compare all multidimensional arrays. Here is an example of comparing three dimensional (3D) array,

import java.util.Arrays;

public class CompareArray {
  
  // main method
  public static void main(String[] args) {

    // declare and initialize 3D arrays
    int arr1[][][] = { {{1,2},{3,4},{5,6}}, {{7,8},{9,1},{2,3}} };
    int arr2[][][] = arr1;
    int arr3[][][] = { {{1,2},{3,4},{5,6}}, {{7,8},{9,1},{2,3}} };
    int arr4[][][] = { {{1,1},{3,3},{5,5}}, {{7,7},{9,9},{2,2}} };
    
    // compare arrays using Arrays.equals() method
    // compare arr1 and arr2
    if(Arrays.deepEquals(arr1, arr2))
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(Arrays.deepEquals(arr1, arr3))
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(Arrays.deepEquals(arr1, arr4))
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
}
Output:-

arr1 & arr2 are same
arr1 & arr3 are same
arr1 & arr4 are not same