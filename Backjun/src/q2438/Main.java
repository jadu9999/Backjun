package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("?");
			
			for(int j=0; j< 5; j++) {
				System.out.print("*");
			}
			 for(int j=0 ;j<7; j++) {
				 System.out.print("&");
			 }
			
			
			
			System.out.println();
		} 

	}

}
