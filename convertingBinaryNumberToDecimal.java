//extract lastDigit
//lastdigi*code2power
//sum
//update number
//update power
import java.util.Scanner;
class convertingBinaryNumberToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();//1010
		int power=0;
		int sum=0;
		while(n>0)
		{
			int lastDigit=n%10;//removing lastDigit 
			int exp=1;
			for(int i=1; i<=power; i++)
			{
				exp=exp*2;
			}
			sum=sum+(lastDigit*exp);
			n=n/10;
			power++;
		}
		System.out.println(sum);
	}
}
