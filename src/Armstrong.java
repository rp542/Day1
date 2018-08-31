import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int d=0,b,temp;
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		temp=n;
		while(n>0)
		{
			b=n%10;
			n=n/10;
			d=d+(b*b*b);
		}
if(temp==d)
	System.out.println("armstrong number");
else
	System.out.println("not a armstrong number");
	}

}
