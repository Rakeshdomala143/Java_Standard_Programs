class strongNumberFrom1To1000CountingNthValu 
{
	public static void main(String[] args) 
	{
		System.out.println("finding the 3rd strong number");
		int num=3;
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
			count++;
			if(count==num)
			{
				System.out.println(temp);
				break;
		}
		
		}
	}
}
}
