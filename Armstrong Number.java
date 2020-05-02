import java.util.*;
class armstrongnumber
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int check=a;
		String k=Integer.toString(a);
		int l=k.length();
		double sum=0;
		while(a>0)
		{
			int b=a%10;
			double p=Math.pow(b,l);
			sum=sum+p;
                        a=a/10;
		}
		int sum1=(int)sum;
		if(sum==check) System.out.println("Armstrong Number");
		else System.out.println("Not Armstrong Number");
	}
}