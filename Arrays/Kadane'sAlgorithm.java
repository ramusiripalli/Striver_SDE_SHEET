/*
Kadane’s Algorithm : Maximum Subarray Sum in an Array
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.
 */
//Brute Force Solution
public class Main {

    public static int maximumSubArraySum(int[] nums, int n) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                maximum = Math.max(sum, maximum);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] array = { -2, -3, 4, -1, -2, 1, 5, 3 };
        int n = array.length;
        int maximSubArray = maximumSubArraySum(array, n);
        System.out.println("Maximum sum of the sub array is " + maximSubArray);
    }
}


optimal : kadane's Algorithm

  class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
          sum+=nums[i];
          if(sum>maximum)
          {
            maximum = sum;
          }
          if(sum<0)
          {
            sum=0;
          }
        }

        return maximum;
    }
}
