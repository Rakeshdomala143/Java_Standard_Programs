import java.util.Scanner;
class digitsEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while(n>0)
		{
			int lastDigit = n%10;
			if(lastDigit%2==0)
			{
System.out.println(lastDigit);
			}
			n=n/10;
		}
	}
}
