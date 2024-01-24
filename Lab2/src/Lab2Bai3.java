import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaMuc1 = 1000; // Giá mỗi số điện dưới 50
        int giaMuc2 = 1200; // Giá mỗi số điện từ 51 trở đi
        int hanMuc = 50; // Hạn mức đầu tiên

        int tien;
        if (soDien <= hanMuc) {
            tien = soDien * giaMuc1;
        } else {
            tien = hanMuc * giaMuc1 + (soDien - hanMuc) * giaMuc2;
        }

        System.out.println("Số tiền điện phải thanh toán: " + tien);

        scanner.close();
    }
}