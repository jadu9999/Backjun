package test;

public class Tpc09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		Tpc09 t = new Tpc09();//heap area(힙)
		System.out.println(t.sum(10, 20));

	}
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}

}
