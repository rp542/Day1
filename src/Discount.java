import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
float newItem, discount, newItemPrice;
System.out.println("Enter actual price");
newItem=in.nextFloat();
System.out.println("Discount is:");
discount=in.nextFloat();
newItemPrice=newItem-(newItem*(discount/100));
System.out.println("new price for the item is"+newItemPrice);
	}

}
