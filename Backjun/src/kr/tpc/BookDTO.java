package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	//디폴트 생성자 메서드(생략)
	public BookDTO() {
		//객체를 생성하는 작업을 한다.(기계어코드) 만들어짐과 동시에 자기자신을 가르키는 this가 만들어진다.
	}
	public BookDTO(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	

}
