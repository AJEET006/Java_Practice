package codingPractice;
import java.util.*;
/*
 * we’ll check if the sum of the factorial of each 
individual digit of the number is equal to the number itself or not.
*/
class StrongNumber{  
	
	//recursive function
	 static int fact(int num)
	  {
	     if(num == 0)
	        return 1;
	        
	    return num * fact(num-1);
	  }
	/* Non-Recursive function
	 * public static int fact(int num){
	 * int factorial = 1; 
	 * for(int i=1; i<=num;i++)
	 * { 
	 * factorial = factorial*i;
	 *  } 
	 *  return factorial;
	 *   }
	 */
	public static void strongNum(int num)
	{
		int temp =num;
		int sum =0; ;
		while(temp!=0)
		{
			int n =temp%10;
			sum=sum+fact(n);
			temp=temp/10;			
		}
		if(sum==num) {
			System.out.println(num +" is a strong number");
		}
		else {
			System.out.println(num +" is not a strong number");
		}

	}

	public static void main(String [] args)
	{
		System.out.print("Enter a number = ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		strongNum(num);
	}


}