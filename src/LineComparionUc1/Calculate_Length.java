package LineComparionUc1;
import java.util.Scanner;
public class Calculate_Length {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double x1,x2,y1,y2;
		 int line1;
		 System.out.println("Enter x1 & y1 values of First point");
		 x1 = sc.nextDouble();
		 y1 = sc.nextDouble();
		 System.out.println("Enter x2 & y2 values of Second point");
		 x2 = sc.nextDouble();
		 y2 = sc.nextDouble();       
		 line1=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		 System.out.println("Distance of the First line = "+line1);
		 sc.close();

	}

}
