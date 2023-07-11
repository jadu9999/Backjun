package test;

import kr.tpc.BookDTO;

public class Tpc13 {

	public static void main(String[] args) {
		String title="스프링";
		int price=25000;
		String company="제이펍";
		int page=890; 
		
		BookDTO dto;//dto(object)
		dto = new BookDTO(title,price,company,page);//dto(Instance:인스턴스)
		
		bookPrint(dto);
		

	}
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.company + "\t");
		
	}

}
