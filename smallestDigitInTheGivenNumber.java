import java.util.Scanner;
class smallestDigitInTheGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
		int smallest = n%10;
		while(n>0)
		{
			int lastDigit = n%10;
		if(lastDigit<smallest)
			{
			smallest=lastDigit;
	}
	n=n/10;
		}
		System.out.println(smallest);
	}
	}
}
