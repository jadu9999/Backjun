package kr.tpc;

public class BookVo {
	public String title;
	public int price;
	public String company;
	public int page;
	//디폴트 생성자매서드(생략)
	
	public BookVo() {
		//초기화 작업
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	//생성자 메서드 중복정의
	public BookVo(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
		
	}

}

