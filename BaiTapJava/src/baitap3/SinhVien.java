package baitap3;

import java.util.Date;

public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public SinhVien(String ht, Date ns, float tb){
        hoTen = ht;
        ngaySinh = ns;
        diemTB = tb;
    }

    @Override
    public String toString() {
        return "Ho ten : " + hoTen + '\'' +
                " Ngay Sinh : " + ngaySinh +
                " Diem TB : " + diemTB ;
    }
}
