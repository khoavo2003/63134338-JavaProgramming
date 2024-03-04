import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            String tenSp = scanner.nextLine();

            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine();

            list.add(new SanPham(tenSp, donGia));

            System.out.print("Nhập thêm (Y/N)? ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }

        Collections.sort(list, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        });
        System.out.println("Danh sách sản phẩm sắp xếp giảm dần theo giá: " + list);

        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSpToRemove = scanner.nextLine();
        list.removeIf(sanPham -> sanPham.getTenSp().equals(tenSpToRemove));
        System.out.println("Danh sách sau khi xóa: " + list);

        double sum = 0;
        for (SanPham sanPham : list) {
            sum += sanPham.getDonGia();
        }
        double average = sum / list.size();
        System.out.println("Giá trung bình của các sản phẩm: " + average);
    }
}