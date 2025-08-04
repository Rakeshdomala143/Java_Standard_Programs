
class oddAndEvenSreiesRowAndColumn 
{
	public static void main(String[] args) 
	{
		for( int i=1; i<=5; i++)
		{
			int num=1;
			 int n=2;
			for(int j=1; j<=5; j++)
			{
				if(i==1 || i==3 || i==5)
				{
					System.out.print(num+"\t");
					num=num+2;
				}
					else
					{
					System.out.print(n+"\t");
					n=n+2;
					}
			}
			System.out.println();
		}		
	}
}
