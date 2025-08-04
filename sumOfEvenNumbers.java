import java.util.Scanner;
class sumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=0;
		int lastDigit=n%10;
		while(n>0)
		{
	if(lastDigit/2==0)
			{
			sum=sum+lastDigit;
			n=n/10;
			}
			System.out.println(lastDigit);
		}
		
	}
}
