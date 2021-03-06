package LT_Java_Bai12;
import java.util.Scanner;

class NhanVien {
	String TenNV;
	int Tuoi;
	String DiaChi;
	double TienLuong;
	int TongSoGioLam;
	
	NhanVien(){
		TenNV = "";
		Tuoi = 0;
		DiaChi = "";
		TienLuong = 0;
		TongSoGioLam = 0;
	}
	
	String getThongTin() {
		String tt = "Ten : " + TenNV + "     Tuoi : " + Tuoi+ "        Dia Chi : " + DiaChi 
					+ "     Tien luong : " + TienLuong + "     Tong so gio lam : " + TongSoGioLam + "\n";
		return tt;
	}
	
	double tinhThuong() {
		if(TongSoGioLam >= 200) {
			return TienLuong*20/100;
		}
		else if (TongSoGioLam < 100) {
			return 0;
		}
		else {
			return TienLuong*10/100;
		}
	}
}

interface  IQuanLy {
	void themDS(NhanVien nv);
	void inDS(NhanVien nv);
}


public class BaiTapJava1_2 {
	public static void main(String[] args) {
		//Bai tap 1
		NhanVien nv1 = new NhanVien();
		System.out.print(nv1.getThongTin());
//		NhanVien nv2 = new NhanVien();
//		System.out.print(nv2.getThongTin());
		
		QuanLiNhanVien qlnv = new QuanLiNhanVien();
		NhanVien[] nv = new NhanVien[6];
		for(int i=0; i<2; i++) {
			qlnv = new QuanLiNhanVien();
			nv[i] = new NhanVien();
			qlnv.themDS(nv[i]);
		}
		for(int i=0; i<2; i++) {
			qlnv.inDS(nv[i]);
		}
	}
}
