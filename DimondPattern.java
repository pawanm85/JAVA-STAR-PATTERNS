class DimondPattern 
{
	public static void main(String[] args) 
	{
		int k=0;
		int m=0;

		for (int i=1;i<5; i++ )
		{
			for (int j=1;j<=7 ;j++ )
			{
				if (i==i && j>=5-i && j<=4+i && k==0)
				{
				System.out.print("*"+" ");
				k=1;
				}
				else
				{
					System.out.print(" ");
					k=0;
				}
			}
					System.out.println();
			}
			
			for (int i=1;i<=3;i++)
		{
			for (int j=1;j<=7 ;j++ )
			{
				if (i==i && j>=1+i && j<=7-i && m==0)
				{
				System.out.print("*"+" ");
				m=1;
				}
				else
				{
					System.out.print(" ");
					m=0;
				}
			}
					System.out.println();
			}
	}
}
