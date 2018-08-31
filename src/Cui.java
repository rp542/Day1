import java.util.Scanner;

public class Cui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username="priyanka";
String password="priya";
Scanner in=new Scanner(System.in);
int count=0;
while(count<3)
{
	System.out.println("Enter username");
	String u = in.nextLine();
	System.out.println("Enter password");
	String p = in.nextLine();
	if(username.equals(u) && password.equals(p))
	{
		System.out.println("Welcome");
		return;
	}
	else
	{
		count++;
	}
	if(count!=3)
	{
		System.out.println("Try Again");
	}
	if(count==3)
	{
		System.out.println("Contact Admin");
	}
}
	}

}
