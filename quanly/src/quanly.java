

import java.util.Scanner;

public class quanly {
    public int n1;
    public int n2;
    public GiaoDich[] giaoDich;

    public quanly() {
        giaoDich = new GiaoDich[100];
    }

    public void nhapGiaoDichVang() {
        Scanner scanner = new Scanner(System.in);
        this.n1 = scanner.nextInt();
        for (int i = 0; i < n1; i++) {
            giaoDich[i] = new GiaoDichVang();
            giaoDich[i].input();
        }
    }

    public void nhapGiaoDichTienTe() {
        Scanner scanner = new Scanner(System.in);
        this.n2 = scanner.nextInt();
        for (int i = n1; i < n1 + n2; i++) {
            giaoDich[i] = new GiaoDichTienTe();
            giaoDich[i].input();
        }
    }
    public void hienThiGiaoDichVang(){
        for (int i = 0; i < n1+n2; i++) {
           if (giaoDich[i] instanceof GiaoDichVang){
               System.out.println(giaoDich[i]);
           }
        }
    }

    public double tienGiaoDichVang() {
        double tong = 0;
        for (int i = 0; i < n1 + n2; i++) {
            if (giaoDich[i] instanceof GiaoDichVang) {
                tong += ((GiaoDichVang) giaoDich[i]).tinhTien();
            }
        }
        return tong;
    }

    public double tienGiaoDichTienTe() {
        double tong = 0;
        for (int i = 0; i < n1 + n2; i++) {
            if (giaoDich[i] instanceof GiaoDichTienTe) {
                tong += ((GiaoDichTienTe) giaoDich[i]).tinhTien();
            }
        }
        return tong;
    }

}
