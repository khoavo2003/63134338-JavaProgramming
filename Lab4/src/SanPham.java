import java.util.Scanner;

public class SanPham {
	private String tenSp;
    private double donGia;
    private double giamGia;

    public double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + this.getThueNhapKhau());
    }

    public void nhap(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
}
