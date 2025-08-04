import java.util.Scanner;
class lastDigitAndFirstDigitSumEqualToMiddleNumberSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum1=n%10;
		int sum2=0;
		n=n/10;
		while(n>9)
		{
			int lastDigit=n%10;
			sum2=sum2+lastDigit;
			n=n/10;
		}
		sum1=sum1+n;
		if(sum1==sum2)
		{
			System.out.println("it is an a xyleom number");
		}
			else
			{
				System.out.println("it is an a pholeam number");
			}
		}
	}
