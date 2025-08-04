//..145...5!=120, 4!=24, 1!=1=====120+24+1=145 its is equal to starting number than it is an a strong number
import java.util.Scanner;
class strongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("the numbers from 1 to 100");
		int n = sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int fact=1;
			int lastDigit=n%10;
			for(int i=1; i<=lastDigit; i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
				n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("it is an a strong number");
		}
		else
		{
			System.out.println("it is not an a strong number");
		
		}
			
	}
}
