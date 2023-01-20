import java.util.*;
import java.io.*;


class Sample{

	public static int fact(int num)
		{
			if(num == 0)
				return 1;

			return num * fact(num-1);
		}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = scan.nextInt();

		System.out.print("Factorial of Number "+num+" is : "+fact(num));

        
	}
}

// input 5:

// 5*fact(4)
// 4*fact(3)
// 3*fact(2)
// 2*fact(1)
// 1*fact(0)
// if num == 0
//   return 1
// 1*1=1
// 2*1=2
// 3*2=6
// 4*6=24
// 5*24=120
