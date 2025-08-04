import java.util.Scanner;
class spyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int lastDigit=n%10;
			sum=sum+lastDigit;
			pro=pro*lastDigit;
			n=n/10;
		}
		if(sum==pro)
		{
			System.out.println("It is an a spy number");
		}
			else
			{
				System.out.println("It is not an a spy number");
			}
		}
	}

