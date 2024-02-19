import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng sp1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm thứ nhất:");
        System.out.print("Tên sản phẩm: ");
        String tenSp1 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia1 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia1 = scanner.nextDouble();
        SanPham sp1 = new SanPham(tenSp1, donGia1, giamGia1);

        // Tạo đối tượng sp2
        scanner.nextLine(); // Đọc bỏ dấu new line
        System.out.println("Nhập thông tin sản phẩm thứ hai:");
        System.out.print("Tên sản phẩm: ");
        String tenSp2 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia2 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia2 = scanner.nextDouble();
        SanPham sp2 = new SanPham(tenSp2, donGia2, giamGia2);

        // Xuất thông tin của hai sản phẩm
        System.out.println("\nThông tin sản phẩm thứ nhất:");
        sp1.xuat();
        System.out.println("\nThông tin sản phẩm thứ hai:");
        sp2.xuat();
    }
}
