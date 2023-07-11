package test;

import kr.tpc.BookVo;

public class Tpc11 {

	public static void main(String[] args) {
		BookVo b = new BookVo(); 
		b.title = "파이썬";
		b.price = 16000;
		b.company="에이콘";
		b.page = 700;
		
		System.out.print(b.title + "\t");
		System.out.print(b.company + "\t");
		System.out.println();
		
		BookVo b1 = new BookVo(); 
		b1.title = "오라클";
		b1.price = 16000;
		b1.company="이지스퍼블리싱";
		b1.page = 700;
		
		System.out.print(b1.title + "\t");
		System.out.print(b1.company + "\t");


	}
	

}
