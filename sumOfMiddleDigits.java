import java.util.Scanner;
class sumOfMiddleDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		n=n/10;
		int sum=0;
		while(n>9)
		{
			int lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;
		}
		System.out.println(sum);

	}
}
