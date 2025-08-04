class strongNumberFrom1To1000Counting 
{
	public static void main(String[] args) 
	{
		System.out.println("the numbers from 1 to n");
		int count=0;
		for(int j=1; j<=1000; j++)
		{
			int n=j;
			int temp=j;
			int sum=0;
		while(n>0)
		{
			int fact=1;
			int lastDigit=n%10;
			for(int i=1; i<=lastDigit; i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
				n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp);
			count++;
		}
		
		}
		System.out.println("the total count is "+count);

			
	}
}
