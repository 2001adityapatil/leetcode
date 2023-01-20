import java.util.*;
import java.io.*;


class Sample{

	public static void swap(int a, int b, int[] nums)
		{
			int t = nums[a];
			nums[a] = nums[b];
			nums[b] = t;

			// return nums;
		}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = {15,16,6,8,5};

		for(int i = 0; i < nums.length-1; i++)
		{
			for(int j = 0; j < nums.length-1; j++)
			{
				if(nums[j] > nums[j+1])
				swap(j, j+1, nums);
			}
		}

		for(int i = 0; i < nums.length; i++)
			System.out.print(" "+nums[i]);
        
	}
}
