import java.util.Scanner;
class toPrintSpacesAndStarCountPyrimad2Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row count");
		int rows = sc.nextInt();
		int starCount=(rows*2)-1;
		int spaceCount=0;
		for(int i=1; i<=rows; i++)
		{
			for(int a=1; a<=spaceCount; a++)
			{
				System.out.print(" ");
			}
			for( int b=1;b<=starCount; b++)
			{
				System.out.print("*");
			}
			spaceCount++;
			starCount-=2;
			System.out.println();
		}
	}
}
