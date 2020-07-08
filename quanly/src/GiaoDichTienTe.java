

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    public float tiGia;
    public String loaiTienTe;

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public GiaoDichTienTe() {

    }

    public GiaoDichTienTe(int maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soluong) {
        super(maGiaoDich, ngayGiaoDich, donGia, soluong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap loai tien");
        scanner.nextLine();
        this.loaiTienTe = scanner.nextLine();
        System.out.println("nhap ti gia");
        this.tiGia = scanner.nextFloat();
    }

    public double tinhTien() {
        return this.getSoLuong() * this.getDonGia() * this.tiGia;
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichTienTe{" +
                "tiGia=" + tiGia +
                ", loaiTienTe='" + loaiTienTe + '\'' +
                '}';
    }
}
