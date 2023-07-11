package test;

import com.google.gson.Gson;

import kr.tpc.BookVo;
import kr.tpc.MYutil;

public class Tpc18 {

	public static void main(String[] args) {
		//1.자바에서 제공해주는 클래스들... API
		//문자열(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase());
		
		//2.직접 만들어서 상용하는 클래스 ... DTO/VO , DAO, Utility..API
		MYutil my = new MYutil();
		int sum = my.hap();
		System.out.println(sum);
		
		//3.다른회사에서 만들어놓은 클래스..API
		//Gson -> json
		Gson g = new Gson();
		
		BookVo vo = new BookVo("자바",13000,"영진",800);
		String json=g.toJson(vo);
		
		System.out.println(json);
		

	}

}
