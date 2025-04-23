package njit.cs.demo.util;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] arges) {
		
		String textString = new String ("java"); 
	    String x=textString.replace('j', 'c');
	    System.out.println("x=="+x);
	    
		
		String s = "011001";
		List<Integer> arr = new ArrayList<>();//{10, 4, -8, 7};
		arr.add(10);
		arr.add(4);
		arr.add(-8);
		arr.add(7);
		
		Test test = new Test();
		
		int result = test.getSubstringCount(s);
		
		int count  = test.splitIntoTwo(arr);
		
        System.out.println("result="+result);
        System.out.println("count="+count);
	}
	/*
	  A binary string is a string consisting only of 0s and 1s.
 	  A substring is a contiguous group of characters within a string.
	  Given a binary string, find the number of substrings that contain an equal number of 0s and 1s and all the Os and 1s are grouped together. Note that duplicate substrings are also counted in the answer. For example, '0011' has two overlapping substrings that meet the criteria: '0011' and '01'.
	  Example
	    5 = "011001"
		The substrings "01", "10", "1100", and "01" have equal numbers of 0s and 1s with all Os and 1s grouped consecutively. Hence, the answer is 4. Note that the substring "0110" has an equal number of 0s and 1s but is not counted because not all Os and 1s are grouped together.
		Function Description
		Complete the function getSubstringCount in the editor below.
		getSubstringCount has the following parameters):
		s: a binary string
		 */
	private int getSubstringCount(String s) 
	{
		int result = 0;
        int prevCount = 0;
        int currentCount = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                currentCount++;
            } else {
                // When we find a transition (0->1 or 1->0)
                // The number of valid substrings is the minimum of previous and current group lengths
                result += Math.min(prevCount, currentCount);
                prevCount = currentCount;
                currentCount = 1;
            }
        }
        
        // Check the last transition
        result += Math.min(prevCount, currentCount);
        
 
		return result;	
	}
	/*
	  Given an array of integers, determine the number of ways the entire array be split into two non-empty subarrays, left and right, such that the sum of elements in the left subarray is greater than the sum of elements in the right subarray.
	  Example
		arr = [10, 4, -8, 7]
		There are three ways to split it into two non-empty subarrays:
		1. [10] and [4, -8, 7], left sum = 10, right sum = 3
		2. [10, 4] and [-8, 7], left sum = 10 + 4 = 14, right sum = -8 + 7 = -1
		3. [10, 4, -8] and [7], left sum = 6, right sum = 7
		The first two satisfy the condition that left sum > right sum, so the return value should be 2.
		Function Description
		Complete the function splitinto Two in the editor below. The function must return a single integer.
		splitinto Two has the following parameters): int arr[n]: integer array
	 */
			
	private int splitIntoTwo(List<Integer> arr) 
	{
		 int totalSum = 0;
	        // Calculate the total sum of the array
	        for (int num : arr) {
	            totalSum += num;
	        }
	        
	        int count = 0;
	        int leftSum = 0;
	        
	        // Iterate through all possible split points (excluding the last element)
	        for (int i = 0; i < arr.size() - 1; i++) {
	            leftSum += arr.get(i);
	            int rightSum = totalSum - leftSum;
	            
	            if (leftSum > rightSum) {
	                count++;
	            }
	        }
	        
        
        return count;
	}
}
