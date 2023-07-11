package test;

public class Tpc07 {

	public static void main(String[] args) {
		int a=20;
		float b = 56.7f;
		
		float v = sum(a,b);// call by value
		System.out.println(v);//76.7
		
		
		int[] arr = {1,2,3,4,5};
		//배열의 총 합
		int vv = arrSum(arr);//call by reference(번지)
		System.out.println(vv);

	}
	private static int arrSum(int[] arr) {
		int hap=0;
		for(int i = 0; i<arr.length; i++) {
			hap+=arr[i];
		}
		return hap;
	}
	public static float sum(int a, float b) {
	float v = a + b;
	return v;
	}


}
