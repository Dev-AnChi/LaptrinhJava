package baitap1;

public class main {
    public static void main(String[] args) {
        context ct = new context();
        ct.setTinhToan(new Cong());
        System.out.println(ct.tinh(75,12));

        ct.setTinhToan(new Tru());
        System.out.println(ct.tinh(54,78));
    }
}
