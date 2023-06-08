package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] count = new int [9];
		int total = 0;
		int sub = 0;
		int a = 0;
		int b = 0;
		
		sc.close();
		
		for(int i = 0 ; i < count.length; i++) {
			count[i] = sc.nextInt();			
			total+=count[i];
		}
		
		sub = total-100;
		
		for(int i = 0 ; i < count.length; i++) {
			for(int j = 0; j < count.length; j++) {
				if(sub == count[i]+count[j]) {
					a = count[i];
					b = count[j];
				}
			}
			if(count[i] != a && count[i] != b) {
				System.out.println(count[i]);
			}
		}
		
	}

}
