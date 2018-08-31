import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		int a, b=0;
		Scanner in=new Scanner(System.in);
a=in.nextInt();
if(a<=180000)
{
	System.out.println("Nill");
}
else if(a>=180000 && a<=300000)
{
	b=(10*a)/100;
	System.out.println("The tax amount is"+b);
}
else if(a>=300001 && a<=500000)
{
	b=(20*a)/100;
	System.out.println("The tax amount is"+b);
}
else if(a>=500001 && a<=1000000);
{
	b=(30*a)/100;
	System.out.println("The tax amount is"+b);
}
	}

}
