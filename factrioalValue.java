import java.util.Scanner;
class factrioalValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while(n>0){
			int lastDigit=n%10;
			int fact=1;

		for(int i=1; i<=lastDigit; i++)
		{

			fact=fact*i;
		}
			System.out.println(fact);
		n=n/10;
		}
	}
}
