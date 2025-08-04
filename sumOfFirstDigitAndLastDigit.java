import java.util.Scanner;
class sumOfFirstDigitAndLastDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=n%10;
		while(n>9)
		{
			n=n/10;
		}
		sum=sum+n;
		System.out.println(sum);
	}
}
