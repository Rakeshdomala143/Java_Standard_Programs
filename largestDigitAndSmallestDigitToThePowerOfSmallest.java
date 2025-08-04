//enter the digit
//extract lastDigit
//compare largest to smallest Digit
//largest digit is base poer smallest digit
//end..45679
import java.util.Scanner;
class largestDigitAndSmallestDigitToThePowerOfSmallest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int exp=1;
		int largest=0;
		int smallest=9;
		while(n>0)
		{
			int lastDigit=n%10;//9,7,6,5,4
			if(lastDigit>largest){//9>0,7>9,6>9,5>4
				largest=lastDigit;
			}
		if(lastDigit<smallest)//9<=9,7<=9,6<=9,5<=9,4<=9
		{
			smallest=lastDigit;
		}
			n=n/10;
			}
			System.out.println(largest);//9
			System.out.println(smallest);//4
		for(int i=1; i<=smallest; i++)//1<=4,2<=4,3<=4,3<=4,4<=4
			{
		exp=exp*largest;//1*9,2*9,3*9,4*9
			}
		System.out.println(exp);//9*4
	}
	}

	
