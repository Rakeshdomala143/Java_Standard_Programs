import java.util.Scanner;
class productOfMiddleNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int pro=1;
		n=n/10;
		while(n>9)
		{
			int lastDigit=n%10;
			pro=pro*lastDigit;
			n=n/10;
		}
		System.out.println(pro);
	}
}
