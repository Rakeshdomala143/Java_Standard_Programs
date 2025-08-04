import java.util.Scanner;
class firstDigitIsAPrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count=0;
		while(n>9)
		{
			n=n/10;
		}
		System.out.println(n);
		for(int i=1; i<=n; i++)
		{
			if(n % i == 0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("It is an a prime number");
			}
			else
			{
				System.out.println("It is not an a prime");
			}
	}
}
