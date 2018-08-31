import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter any word");
String s=in.nextLine();
int l=s.length();
char ch;
String ans="";
for(int i=0;i<l;i++)
{
	ch=s.charAt(i);
	if(ch!=' ')
	
		ans=ans+ch;
		s=s.replace(ch,' ');
	
	
}
System.out.println(" "+ans);
	}

}
