package baitap1;

public class context {
    Tinh TinhToan;
    public void setTinhToan(Tinh tinhToan) {
        TinhToan = tinhToan;
    }

    float tinh(float a, float b) {
        return TinhToan.tinh(a,b);
    }
}
