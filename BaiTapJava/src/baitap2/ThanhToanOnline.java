package baitap2;

public class ThanhToanOnline implements IThanhToan{
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 1000000){
            return tienHang*95/100;
        }
        else{
            return tienHang*93/100;
        }
    }
}
