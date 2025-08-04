import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int rows = sc.nextInt();
		System.out.println("enter the columns");
		int col = sc.nextInt();
		char ch = sc.next().charAt(0);
		

		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=col; j++)
			{
				for(ch='a';ch<='d';ch++)
				{
				if(i==j)
				{
					System.out.println(ch++);
					
		
		}
		System.out.println();
		}
		
	}
}

