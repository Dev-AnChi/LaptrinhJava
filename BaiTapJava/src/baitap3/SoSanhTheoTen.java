package baitap3;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.hoTen.compareTo(o2.hoTen) > 0){
            return 1;
        }
        else if (o1.hoTen.compareTo(o2.hoTen) == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
