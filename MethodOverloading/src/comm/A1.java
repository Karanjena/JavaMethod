package comm;

public class A1 {
	void add() {
		this.add(12,21);
		System.out.println("k");
	}
	void add (int a,int b) {
		this.add(12, 12.09);
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,double b) {
		this.add(12.23, 23);
		double f=a+b;
		System.out.println(f);
	}
	void add(double a,int b) { 
		System.out.println("s");
	}
	public static void main(String[] args) {
		A1 a=new A1();
		a.add();
	}
}
