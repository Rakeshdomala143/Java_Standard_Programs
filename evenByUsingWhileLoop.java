import java.util.Scanner;
class evenByUsingWhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			if(n%2==0)
			{
		System.out.println(i);
		i++;
			}
		}
	}
}
