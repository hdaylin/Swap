import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		

		int x, y, temp;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp  = x  + y; 
	      x = temp - x; 
	      y = temp - y;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	   }
	}
