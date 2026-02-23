// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
package src.arrays_1d;

import java.util.*;
public class TwoSum {
    static int[] twoSum(int[] arr, int target ){
       for(int i=0;i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j]== target){
               return new int[]{i, j}; 
            }
        }
       } 
       return new int[]{-1, -1};
    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an array ");
      int n = sc.nextInt();

      int [] arr = new int[n];
      System.out.println("Enter " +n+ " elements");
      for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
      }

      System.out.println("Enter the target ");
      int x = sc.nextInt();

      System.out.println("The indices are: "+Arrays.toString(twoSum(arr,x)));
      


      
      
    }

    
}
