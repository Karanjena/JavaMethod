package comm;

public class Project {
	void Add() {
		this.Add(10,19.09);
		System.out.println("M1");
	}
	void Add(int a) {
		this.Add("Karan",21.08);
		System.out.println("M2");
	}
	void Add(int a,double b) {
		this.Add(10);
		System.out.println("M3");
	}
	void Add(String a,double b) {
		System.out.println("M4");
	}
	public static void main(String[] args) {
		Project p=new Project();
		p.Add();
	}
}
