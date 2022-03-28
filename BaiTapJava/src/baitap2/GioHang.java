package baitap2;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IThanhToan hinhthucTT;

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    List<HangHoa> gioHang = new ArrayList<HangHoa>();
    void taogioHang(){
        HangHoa hh;
        hh = new HangHoa("Tivi", 800000, "10inch");
        gioHang.add(hh);
        hh = new HangHoa("TuLanh", 1000000, "Sonic");
        gioHang.add(hh);
        hh = new HangHoa("MayGiac", 1500000, "Sonic");
        gioHang.add(hh);
    }

    double thanhToan(){
        int Tongtien = 0;
        for (HangHoa i:gioHang){
            Tongtien += i.gia;
        }
        return hinhthucTT.thanhToan(Tongtien);
    }

}
