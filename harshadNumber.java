import java.util.Scanner;
class harshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("it is an a harshad number");
		}
		else
		{
			System.out.println("it is not an a harshad number");
		}
	}
}
