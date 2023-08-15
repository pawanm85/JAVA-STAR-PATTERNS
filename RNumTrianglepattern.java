class Patterns 
{
	public static void main(String[] args) 
	{
		
		p2();


	}
	public static void P2()
	{
		char a=65;
		for (int i=1;i<=5 ;i++ )
		{
					
			for (int j=1;j<=5 ;j++ )
			{
				if(i==i && j>=1 && j<=i)
				{
					System.out.print(a + " ");
					a++;
				}
					else
				{
					System.out.print(" ");
				}
				
			}
					
			System.out.println();
			
		}
	}
	public static void P3()
	{
		for (int i=1;i<=5 ;i++ )
		{
					
			for (int j=1;j<=5 ;j++ )
			{
				if(i==i && j>=1 && j<=i)
				{
					System.out.print("*" + " ");
					
				}
					else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
	public static void P4()
	{
		int a=1;
		for (int i=1;i<=5 ;i++ )
		{
					
			for (int j=1;j<=5 ;j++ )
			{
				if(i==i && j>=1 && j<=i)
				{
					System.out.print(a + " ");
					
				}
					else
				{
					System.out.print(" ");
				}
				
			}
					a++;
			System.out.println();
			
		}
	}
}
