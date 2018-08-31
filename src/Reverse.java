import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	String s= obj.nextLine();
	char[] p=s.toCharArray();
for(int i=p.length-1;i>=0;i--)
System.out.print(p[i]);
	}
}
