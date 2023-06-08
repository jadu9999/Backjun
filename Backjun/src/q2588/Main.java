package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int sum = 0;
		
		int [] arr = new int[3];
		
		for(int i =arr.length-1;i>=0;i--) {
			arr[i] = b.charAt(i)-'0';
			sum = arr[i] * a;
			if(i==1) {
				sum = arr[i] * a *10;
				arr[i] = sum;
				System.out.println(sum/10);
			}else if(i==0) {
				sum = arr[i] * a * 100;
				arr[i] = sum;
				System.out.println(sum/100);
			}else {
				arr[i] = sum;
				System.out.println(sum);
			}
		}
		sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum +=arr[i];
				
		}
		System.out.println(sum);
	}

}
