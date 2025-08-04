//fibnoci series always start with 0 
import java.util.Scanner;
class fibonaciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to 10 fibnoci series");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		 int sum=0;
		 for(int i=1; i<=10; i++)//1 to 10 numbers
		{
			 System.out.println(sum);// first printing the sum
			 a=b;//b==1 store in a
			 b=sum;//0 can store in b
			 sum=a+b;//1+0==1
		}
	}
}
