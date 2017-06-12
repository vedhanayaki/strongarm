package vvv;
import java.util.Scanner;
public class vvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a;
		int c,d,e=0;
		System.out.println(b);
while(a!=0)
{
		c=b%10;
		d=b*b*b;
		e=e+d;
		b=b%10;
System.out.println(e);
}
		if(a==e)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
		

	}

}
