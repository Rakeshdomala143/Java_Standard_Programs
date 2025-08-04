import java.util.Scanner;
class pattern143
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row');
		int row = sc.nextInt();
		System.out.println("enter a col');
		int col = sc.nextInt();
		int num = 1;
		int num = 0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i%2==0)
				{
					System.out.print(num + " ");
				}
				else
				{
					System.out.print(num + " ")
				}
			}
			num++;
			num++;
			System.out.println();
		}
	}
}