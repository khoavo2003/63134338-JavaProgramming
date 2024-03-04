import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.nhap("Sản phẩm 1", 100.0, 10.0);
        sp1.xuat();

        SanPham sp2 = new SanPham();
        sp2.nhap("Sản phẩm 2", 200.0, 20.0);
        sp2.xuat();
    }
}
