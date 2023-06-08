package helloworld;

public class Carculator {
	private int num1; 
	private int num2;
	
	//=========메소드==========
	
	
	public int add() {
		return num1 + num2;
	}
	
	public Carculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int minus() {
		return num1 - num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Carculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
}
