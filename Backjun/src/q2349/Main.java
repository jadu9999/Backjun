package q2349;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(); //5
      sc.close();
      					 //5
      for (int i = 0; i < a; i++) {
         for (int j = 0; j < a-i-1; j++) {
        	 			//0   5-0-1
            System.out.print(" ");
         }

         for (int j = 0; j < i+1; j++) {
            System.out.print("*");

         }
         System.out.println();

      }

   }

}