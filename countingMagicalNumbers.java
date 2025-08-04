class countingMagicalNumbers
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number 1 to 100");
		for(int i=1; i<=100; i++)
		{
			int n=i;
			int count=0;
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
			int lastDigit=n%10;
				sum=sum+lastDigit;
				n=n/10;
		}
		n=sum;
	}
	if(n==1)
	{
		count++;
	System.out.println(count);
	
	}
	
	}
}
}