import java.util.Scanner;
class digitsOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while(n>0)
		{
			int lastDigit = n%10;
		System.out.println(lastDigit);
		n=n/10;
		}
	}
}
