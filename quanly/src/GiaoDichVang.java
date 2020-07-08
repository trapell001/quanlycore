

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soLuong) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }


    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("tinh trang" );
        scanner.nextLine();
        this.loaiVang = scanner.nextLine();
    }

    public double tinhTien() {
        return this.getDonGia() * this.getSoLuong();
    }

    @Override
    public String toString() {
        return super.toString() +  "GiaoDichVang{" +
                "loaiVang='" + loaiVang + '\'' +
                '}';
    }
}
