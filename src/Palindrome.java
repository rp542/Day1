import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int d=0,b,temp;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		temp=n;
		while(n>0)
		{
			b=n%10;
			n=n/10;
			d=(d*10)+b;
		}
if(temp==d)
	System.out.println("true");
else
	System.out.println("false");
	}

}
