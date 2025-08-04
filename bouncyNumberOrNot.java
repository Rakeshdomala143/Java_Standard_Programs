import java.util.Scanner;
class bouncyNumberOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sort=0;
		for(int i=1; i<=9; i++)
		{
			int temp=n;
			while(temp>0)
			{
				int lastDigit=n%10;
				if(lastDigit==i)
				{
					sort=sort*10+i;
				}
				temp=temp/10;
			}
		}
		int ascsort=sort;
		int decsort=0;
		while(sort>0)
		{
			int lastDigit=n%10;
			decsort=decsort*10+lastDigit;
			sort=sort/10;
		}
		if(n!=ascsort && n!=descsort)
		{
			System.out.println("it is an a bouncy number");
		}
		else
		{
			System.out.println("it is not an a bouncy number");
		}
	}
}
