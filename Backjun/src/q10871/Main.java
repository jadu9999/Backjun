package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a[] = new int[x];
		int b = sc.nextInt();
		
	
		
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<a.length; i++) {
			if(a[i]<b) {
			 System.out.print(a[i] + " ");
			}
			
			}
		
		}

	}


