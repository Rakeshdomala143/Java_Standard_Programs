import java.util.Scanner;
class descendingOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sort=0;
		for(int i=9; i>=1; i--)
		{
			int temp=n;
			while(temp>0)
			{
				int lastDigit=temp%10;
				if(lastDigit==i)
				{
					sort=sort*10+i;
				}
				temp=temp/10;
			}
		}
		System.out.println(sort);
	}
}
