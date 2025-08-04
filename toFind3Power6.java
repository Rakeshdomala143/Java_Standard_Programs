import java.util.Scanner;
class toFind3Power6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int base=3;
		int power=6;
		int exp=1;
		for(int i=1; i<=power; i++)
		{
			exp=exp*base;
		}
		System.out.println(exp);
	}
}
