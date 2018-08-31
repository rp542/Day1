import java.lang.reflect.Array;
import java.util.Scanner;

public class Missing {

	public static void main(String[] args) {
		Scanner Missing=new Scanner(System.in);
int total;
System.out.println("Enter how many numbers to write");
int n=(Missing.nextInt());
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=Missing.nextInt();
}
int x=arr.length;
total=((x+1)*(x+2))/2;
for(int i=0;i<x;i++)
{
	total=arr[i];
}
System.out.println("Missing number is"+total);
	}

}
