import java.util.Scanner;
class toPrintStarCountPyrimad2TriangleFirstRight
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row count");
		int rows = sc.nextInt();
		int starCount=1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=starCount; j++)
			{
				System.out.print("*");
			}
			if(i<(rows/2+1))
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
			
			System.out.println();
		}
	}
}