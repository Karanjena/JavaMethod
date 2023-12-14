package comm;

public class p1 {
	public static void main(String[] args) {
	int n=1989;
	int count=0;
	for(int i=1; i<=n; i++) {
		if(n%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("Primary number");
	} else {
		System.out.println("not Primary number");
	}
}
}
