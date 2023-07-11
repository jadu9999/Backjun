package test;

import kr.tpc.BookDTO;

public class Tpc10 {

	public static void main(String[] args) {
		
		BookDTO b = new BookDTO();
		b.title = "자바책";
		b.price = 17000;
		b.company = "영진";
		b.page = 670;
		
		System.out.print(b.title + "\t");
				

	}
	
}
