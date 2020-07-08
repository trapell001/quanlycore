

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private LocalDate ngayGiaoDich;
    private int donGia;
    private int soLuong;

    public GiaoDich() {
        this.maGiaoDich = 0;
        this.ngayGiaoDich = LocalDate.now();
        this.donGia = 0;
        this.soLuong = 0;
    }

    public GiaoDich(int maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma giao dich");
        this.maGiaoDich = scanner.nextInt();
        System.out.println("nhap ngay thang");
        scanner.nextLine();
        String ngay = scanner.nextLine();
        this.ngayGiaoDich = LocalDate.parse(ngay, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("nhap don gia");
        this.donGia = scanner.nextInt();
        System.out.println("nhap so luong");
        this.soLuong = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "quanly{" +
                "magiaodich=" + maGiaoDich +
                ", ngaygiaodich=" + ngayGiaoDich +
                ", donggia=" + donGia +
                ", soluong=" + soLuong +
                '}';
    }
}
