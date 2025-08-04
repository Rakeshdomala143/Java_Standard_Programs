import java.util.Scanner;
class convertingDecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int ref=0;
		int count1=0;
		int count2=0;
		int rev=0;
		while(n>0)
		{
			int rem=n%2;
			ref=ref*10+rem;
			count1++;
			n=n/2;
		}
		while(ref>0)
		{
			int lastDigit=ref%10;
			rev=rev*10+lastDigit;
			ref=ref/10;
			count2++;
		}
		for(int i=1; i<=count1-count2; i++)
		{
			rev=rev*10;
		}
		System.out.println(rev);
	}
}
