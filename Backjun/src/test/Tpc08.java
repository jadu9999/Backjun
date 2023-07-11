package test;

public class Tpc08 {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		add(a,b);
		System.out.println(add(a,b));//static method ㅊ미ㅣ 

	}
	
	public static int add(int a, int b) {
		int sum= a + b;
		return sum;
	}

}
