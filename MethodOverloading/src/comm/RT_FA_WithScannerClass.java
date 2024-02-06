

package comm;
import java.util.*;
public class RT_FA_WithScannerClass {
	public static double add(int r) {
		
		double c=2*3.14*r;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the R value");
			int r=sc.nextInt();
			System.out.println(RT_FA_WithScannerClass.add(r));
			System.out.println("***********************************");
			    
			}
		sc.close();
	}
	

}
