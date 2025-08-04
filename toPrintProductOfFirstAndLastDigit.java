import java.util.Scanner;
class toPrintProductOfFirstAndLastDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int pro=n%10;
		while(n>9)
		{
			n=n/10;
		}
		pro=pro*n;
		System.out.println(pro);
	}
}
