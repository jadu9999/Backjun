package test;

import kr.tpc.BookVo;

public class Tpc12 {

	public static void main(String[] args) {
		// 생성자 == 생성 + 초기화 ->메소드 중복정의 가능
		BookVo b1 = new BookVo(); 
		System.out.print(b1.title + "\t");
		System.out.print(b1.company + "\t");
		System.out.print(b1.price + "\t");
		System.out.println(b1.page);
		
		BookVo b2 = new BookVo();
		System.out.print(b2.title + "\t");
		System.out.print(b2.company + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.page);
		
		BookVo b3 = new BookVo("python",1800,"대림",920);
		System.out.print(b3.title + "\t");
		System.out.print(b3.company + "\t");
		System.out.print(b3.price + "\t");
		System.out.print(b3.page);
		
	}

}
