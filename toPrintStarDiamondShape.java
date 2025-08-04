import java.util.Scanner;
class toPrintStarDiamondShape
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row count");
		int rows = sc.nextInt();
		int spaceCount=rows/2;
		int starCount=1;
		for(int i=1; i<=rows; i++)
		{
			for(int a=1; a<=spaceCount; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=starCount; b++)
			{
				System.out.print("*");
			}
			if(i<(rows/2+1))
			{
				starCount+=2;
				spaceCount--;
			}
			else
			{
				starCount-=2;
				spaceCount++;
			}
			
			System.out.println();
		}
	}
}