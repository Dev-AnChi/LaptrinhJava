package baitap3;

public class main {
    public static void main(String[] args) {

        QLSV qlsv = new QLSV();
        qlsv.khoitaoDS();

        System.out.println("Sap xep theo ten : ");
        qlsv.setSosanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("Sap xep theo diem : ");
        qlsv.setSosanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}