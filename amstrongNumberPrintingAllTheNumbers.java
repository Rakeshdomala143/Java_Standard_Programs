

class amstrongNumberPrintingAllTheNumbers 
{
	public static void main(String[] args) 
	{
		
		System.out.println("to print 1 to 100 Amstrong number");
		 
		 for(int j=1; j<=1000; j++)
		{
		int n=j;
		int temp=j;
			int sum=0;
			int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
	 n=temp;
		while(n>0)
		{
			int lastDigit=n%10;
			int exp=1;
			for(int i=1; i<=count; i++)
			{
				exp=exp*lastDigit;
			}
			sum=sum+exp;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp);
		}
		}
		
	}
}
