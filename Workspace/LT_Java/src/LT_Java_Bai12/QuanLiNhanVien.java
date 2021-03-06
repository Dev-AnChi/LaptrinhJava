package LT_Java_Bai12;

import java.util.Scanner;

public class QuanLiNhanVien extends NhanVien implements IQuanLy{

	@Override
	public void themDS(NhanVien nv) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ten NV : ");
		nv.TenNV = sc.nextLine();
		System.out.print("Nhap tuoi : ");
		nv.Tuoi = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap dia chi : ");
		nv.DiaChi = sc.nextLine();
		System.out.print("Nhap tien luong : ");
		nv.TienLuong = sc.nextDouble();
		System.out.print("Nhap tong so gio lam : ");
		nv.TongSoGioLam = sc.nextInt();
	}

	@Override
	public void inDS(NhanVien nv) {
		System.out.print(nv.getThongTin());
	}

}
