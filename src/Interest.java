import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principle;
		double rate;
		double years;
		double si; 
		double ci;
		System.out.println("Enter principle amount");
		principle=sc.nextDouble();
		System.out.println("Enter rate of interest");
rate=sc.nextDouble();
System.out.println("Enter years");
years=sc.nextDouble();
si=(principle*years*rate)/100;
ci=principle * Math.pow(1.0+rate/100.0,years) - principle;
System.out.println("simple interest is" +si);
System.out.println("compound interest is" +ci);
	}

}
