package q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //5
			             
		for(int i = 0; i<a; i++) {
			
			for(int j =0 ; j<=i; j++) {
							
				System.out.print("?");
				
			}				//5
			for(int b = 0; b<a; b--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}

}
