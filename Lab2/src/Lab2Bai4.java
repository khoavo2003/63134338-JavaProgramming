import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        menu();
    }

    // Phương thức hiển thị menu
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");

            // Kiểm tra xem có số nguyên có sẵn không
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        giaiPTB1();
                        break;
                    case 2:
                        giaiPTB2();
                        break;
                    case 3:
                        tinhTienDien();
                        break;
                    case 4:
                        System.out.println("Kết thúc chương trình.");
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } else {
                // Xử lý trường hợp không có số nguyên
                System.out.println("Nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.next();  // Bỏ qua dữ liệu không hợp lệ
                choice = 0;      // Đặt giá trị choice là 0 để tiếp tục vòng lặp
            }

        } while (choice != 4);

    }

    // Hàm giải phương trình bậc nhất
    private static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (b == 0) {
            if (c == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -c / b;
            System.out.println("Nghiệm của phương trình: x = " + x);
        }

        scanner.close();
    }

    // Hàm giải phương trình bậc hai
    private static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            giaiPTB1();
        } else {
            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm 1: x1 = " + x1);
                System.out.println("Nghiệm 2: x2 = " + x2);
            }
        }

        scanner.close();
    }

    // Hàm tính tiền điện
    private static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaMuc1 = 1000;
        int giaMuc2 = 1200;
        int hanMuc = 50;

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
