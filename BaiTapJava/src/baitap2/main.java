package baitap2;

public class main {
    public static void main(String[] args) {
        GioHang gh;
        gh=new GioHang();
        gh.taogioHang();
        gh.setHinhthucTT(new ThanhToanOnline());
        System.out.println("Online : " + gh.thanhToan());
        gh.setHinhthucTT(new ThanhToanCOD());
        System.out.println("COD : " + gh.thanhToan());
    }
}
