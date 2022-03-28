package baitap2;

public class ThanhToanCOD implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000){
            return tienHang*98/100;
        }
        else
            return  tienHang;
    }
}
