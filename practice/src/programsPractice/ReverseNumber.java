package programsPractice;

import java.util.Scanner;
public class ReverseNumber{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -->");
		int num = sc.nextInt();
		int x=0;
		int y=0;
		while(num!=0)//535
		{
			x=num%10;//5 //3 //5
			y=y*10+x;//5 //53 //535
			num=num/10;//53 // 5 //0
		}
		System.out.println(y);
		sc.close();
	}

}