package test;

import kr.tpc.MemberVO;

public class Tpc14 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("서울");
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAddr() + "\t");
		 

	}

}
