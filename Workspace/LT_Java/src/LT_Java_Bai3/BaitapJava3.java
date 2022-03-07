package LT_Java_Bai3;

abstract class SinhVienPoly{
	String hoTen="";
	String nganh="";
	
	SinhVienPoly(String ht, String ng){
		hoTen = ht;
		nganh = ng;
	}
	
	abstract double getDiem();
	
	String getHocLuc() {
		double diem = getDiem();
		String hocluc;
		if(diem < 5)
			hocluc = "Yeu";
		else if (diem >= 5 && diem >6.5)
			hocluc = "Trung Binh";
		
	}
}

public class BaitapJava3 {
	public static void main(String[] args) {
		
	}
}
