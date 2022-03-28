package baitap1;

public class Chia implements Tinh {
    @Override
    public float tinh(float a, float b) {
        if(b==0){
            System.out.println("Khong the thuc hien phep tinh");
            return -1;
        }
        else
            return a/b;
    }
}
