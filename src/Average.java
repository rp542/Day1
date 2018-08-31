import java.util.Scanner;
public class Average {
public static void main(String[] args) {
int num[][] = new int[3][3];
int sum1=0,sum2=0,avg2=0,sum3=0,avg3=0,avg1=0;
int sum_1=0,avg_1=0,sum_2=0,avg_2=0,sum_3=0,avg_3=0;
	Scanner sc = new Scanner(System.in);
System.out.println("Enter marks of students");
for(int i=0; i<3;i++)
{
	for(int j=0; j<3;j++)
	{
		num[i][j] = sc.nextInt();
	}
}
for(int j=0;j<3;j++)
{
	sum1 = sum1 + num[0][j];
	sum2 = sum2 + num[1][j];
	sum3 = sum3 + num[2][j];
	avg1 = sum1/3;
	avg2 = sum2/3;
	avg3 = sum3/3;
	}
System.out.println("Marks of student 1 is" +sum1);
System.out.println("Average of student 1 is" +avg1);
System.out.println("Marks of student 2 is" +sum2);
System.out.println("Average of student 2 is" +avg2);
System.out.println("Marks of student 3 is" +sum3);
System.out.println("Average of student 3 is" +avg3);
	for(int i=0; i<3;i++)
	{
		sum_1 = sum_1 + num[i][0];
		sum_2 = sum_2 + num[i][1];
		sum_3 = sum_3 + num[i][2];
		avg_1 = sum_1/3;
		avg_2 = sum_2/3;
		avg_3 = sum_3/3;
	}
		System.out.println("Marks of subject 1 is"+sum_1);
		System.out.println("Average of subject 1 is"+avg_1);
		System.out.println("Marks of subject 2 is"+sum_2);
		System.out.println("Average of subject 2 is"+avg_2);
		System.out.println("Marks of subject 3 is"+sum_3);
		System.out.println("Average of subject 3 is"+avg_3);
	}
}
