import java.util.*;
import java.io.*;


class Sample{

	public static int binarySearch(int num, int[] nums)
		{
			int left = 0;
			int right = nums.length-1;
			int mid;

			while(left <= right)
			{
				mid = (left + right)/2;

				if(nums[mid] == num)
					return mid;

				if(num < nums[mid])
					right = mid-1;
				else
					left = mid+1;
			}
			return -1;
		}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = {1,5,8,10,15};

		System.out.print("Enter the number to Search : ");
		int num = scan.nextInt();

		System.out.print("Using binary search "+num+" no. found at index "+binarySearch(num, nums));
		

        
	}
}
