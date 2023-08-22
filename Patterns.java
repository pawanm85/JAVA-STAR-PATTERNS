class Patterns 
{
	public static void main(String[] args) 
	{
		
		P1();
		P2();
		P3();
		P4();
		P5();


	}
	public static void P1()
	{
		
		for (int i=1;i<=5 ;i++ )
		{
					int a=1;
			for (int j=1;j<=5 ;j++ )
			{
				if(i==i && j>=1 && j<=i)
				{
					System.out.print(a++ + " ");
					
				}
					else
				{
					System.out.print(" ");
				}
				
			}
					
			System.out.println();
			
		}
	}
	public static void P2()
	{
		
		for (int i=1;i<=5 ;i++ )
		{
					char a=65;
			for (int j=1;j<=5 ;j++ )
			{
				if(i==i && j>=1 && j<=i)
				{
					System.out.print(a++ + " ");
					
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
	public static void P5()
	{
		char a=65;
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
