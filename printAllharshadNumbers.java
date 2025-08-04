import java.util.Scanner;
import java.util.Scanner;
class printAllharshadNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			int sum=0;
			int temp=i;
		
		while(n>0)
		{
			int lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;
		}
			if(temp%sum==0)
			{
				System.out.println(temp + " ");
			}
				
		}
	}
}
