package baitap3;

import java.util.*;

public class QLSV {
    ISoSanh<SinhVien> sosanh;
    List<SinhVien> dsSV = new ArrayList<SinhVien>();

    void khoitaoDS(){
        Calendar cal = Calendar.getInstance();
        Date todayDate = new Date();
        cal.setTime(todayDate);

        // Set time
        cal.set(Calendar.DATE, 8);
        cal.set(Calendar.MONTH, 6);
        cal.set(Calendar.YEAR, 2001);
        todayDate = cal.getTime();
        System.out.println("Ngay ne : " + todayDate);

        SinhVien sv;
        sv = new SinhVien("Nguyen Van D", todayDate, (float) 9.5);
        dsSV.add(sv);
        sv = new SinhVien("Nguyen Van A", new Date(), 10);
        dsSV.add(sv);
        sv = new SinhVien("Nguyen Van B", new Date(), 8);
        dsSV.add(sv);
        sv = new SinhVien("Nguyen Van C", new Date(), 5);
        dsSV.add(sv);
    }

    int soSanh(SinhVien s1, SinhVien s2){
        return sosanh.soSanh(s1,s2);
    }

    public void sapXep(){
//        SinhVien temp;
//        for(int i=0; i<dsSV.size()-1; i++){
//            for (int j=i+1; j<dsSV.size(); j++){
//                if(soSanh(dsSV.get(i),dsSV.get(j)) > 0){
//                    temp = dsSV.get(i);
//                    dsSV.set(i, dsSV.get(j));
//                    dsSV.set(j, temp);
//                }
//            }
//        }

        //cach 2
        dsSV.sort((o1,o2)->{
            return sosanh.soSanh(o1,o2);
        });
    }

    public void inDS(){
//        for(SinhVien i:dsSV){
//            System.out.println("Ten : " + i.hoTen + "  Ngay sinh : " + i.ngaySinh + "   Diem TB : " + i.diemTB);
//        }

        //cach2
        dsSV.forEach((i)->{
            System.out.println(i.toString());
        });
    }


    public void setSosanh(ISoSanh<SinhVien> sosanh) {
        this.sosanh = sosanh;
    }

    public void setDsSV(List<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
}
