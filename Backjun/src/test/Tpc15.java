package test;

import kr.tpc.MemberVO;

public class Tpc15 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동",40,"010-1111-1111","서울");
		//생성자 메소드에서 값을 받아서 저장했기때문에 setter메소드는 필요가없다.
		System.out.println(m.toString() );
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setAddr("광주");
		m1.setTel("010");
		System.out.println(m1.toString());
		
		System.out.print(m1.getName() + "\t");
		
	}

}
