import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		Scanner Multi = new Scanner(System.in);
		int p;
		int q;
		int num;
		int i;
		int j;
		System.out.println("Enter array dimensions");
		q=Multi.nextInt();
		p=Multi.nextInt();
		int arr[][]=new int[p][q];
		for(i=0;i<q;i++)
		{
			System.out.println("Enter the elements");
			for(j=0;j<p;j++)
			{
				arr[i][j]=Multi.nextInt();
			}
		}
		System.out.println("Enter the number to be searched");
		num=Multi.nextInt();
		for(i=0;i<q;i++)
		{
			for(j=0;j<p;j++)
			{
				if(arr[i][j]==num)
				{
					System.out.println("The number is found");
					
				}
				
			}
		}
	}
}