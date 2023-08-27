import java.util.Scanner;
class P1Reverce
{
	public static int reverce(int num)
	{
		int rev=0;
		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A num!");
		int num=sc.nextInt();
		int rev=reverce(num);
		System.out.println(rev);
	}
}
