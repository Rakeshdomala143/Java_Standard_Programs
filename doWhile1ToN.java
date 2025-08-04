import java.util.Scanner;
class doWhile1ToN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i = 1;
		do
		{
System.out.println(i);
	i++;
		}
		while (n<=i);
	}
}
