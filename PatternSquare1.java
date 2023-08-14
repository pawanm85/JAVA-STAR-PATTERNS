class PatternSquare1
{
public static void main(String[]args)
 {
	for(int i=0;i<4;i++)
	{
		if(i<2)
		{
			for(int k=0;k<4;k++)
		{
  			System.out.print("*"+" ");
		}
			System.out.println();
		}
			else
			{
				for(int k=0;k<4;k++)
				{
					System.out.print("#"+" ");
				}
					System.out.println();
			}
	}
 }
}
