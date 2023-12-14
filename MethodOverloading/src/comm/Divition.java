package comm;

public class Divition {
	void div() {
		this.div(12,"Karan");
		System.out.println("K1");
	}
	void div(int a,double b) {
		this.div("Karan",12.90);
		System.out.println("K2");
	}
	void div(int a,String b) {
		this.div(20,18.09);
		System.out.println("K3");
	}
	void div(String a,double b) {
		this.div(200,500);
		System.out.println("K4");
	}
	void div(int a,int b) {
		this.div(21.09,21);
		System.out.println("K5");
	}
	void div(double a,int b) {
		System.out.println("K6");
	}
	public static void main(String[] args) {
		Divition d=new Divition();
		d.div();
	}
}
