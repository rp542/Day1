import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		String names[]=new String[31],input;
		int size,i,count=0;
		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter the name to be searched");
input=sc.nextLine();
System.out.println("Enter size of an array");
size = sc.nextInt();
System.out.println("Enter the names");
for(i=0;i<=size;i++)
{
	names[i]=sc.nextLine();
	if(names[i]==input)
	{
		count++;
	}
}
System.out.println("Occurence of the word is:"+count);
	}

}
