import java.util.Scanner;
class primeNumbers1To100 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
for(int i=1; i<=100; i++)
		{
		n=i;
	int count=0;
	for( i=1; i<=n; i++)
		{
		if(n%i==0)
			{
			count++;
			}
		}
			if(count==2)
			{
				System.out.println(n);
			}
		}
	}
}
