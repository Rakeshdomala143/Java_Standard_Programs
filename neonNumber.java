import java.util.Scanner;
class neonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		n=n*n;
		while(n>0)
		{
			int lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("it is an a neon number");
		}
		else
		{
			System.out.println("it is not an a neon number");
		}
	}
}
