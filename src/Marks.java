import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		int n,o,p;
	n=new Scanner(System.in).nextInt();
o=new Scanner(System.in).nextInt();
p=new Scanner(System.in).nextInt();
if(n>60 && o>60 && p>60) {
	System.out.println("Passed");
	}
else if((n>60 && o>60) || (n>60 && p>60) || (o>60 && p>60))
{
	System.out.println("Promoted");
}
else if((n<60 && o<60) || (n<60 && p<60) || (o<60 && p<60))
{
	System.out.println("Failed");
}
}
}