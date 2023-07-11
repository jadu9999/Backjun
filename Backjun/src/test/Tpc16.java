package test;

import kr.tpc.OverLoad;

public class Tpc16 {

	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		ov.hap(50, 50);//ov.hap_int_int(50,50)
		ov.hap(56.7f, 56.7f);//ov.hap_float_float(56.7f,56.7f)
		ov.hap(56.7f, 56);//ov.hap_float_int(56.7f,56)
		
	}

}
