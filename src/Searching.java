import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int number,c,y;
		int[] n={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number to be searched");
number=sc1.nextInt();
y=n.length;
for(c=0;c<y;c++)
{
	if(n[c]==number)
	{
		System.out.println("value is found");
	}
break;
}
	
	if(n[c]!=number)
	{
		System.out.println("value is not found");
	}

	}

}