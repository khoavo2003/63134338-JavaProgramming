import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        // Khai báo mảng họ tên và điểm của sinh viên
        String[] names = new String[n];
        double[] scores = new double[n];

        // Nhập thông tin họ tên và điểm của từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập họ tên của sinh viên thứ %d: ", i + 1);
            scanner.nextLine(); // Đọc bỏ ký tự newline từ lệnh trước
            names[i] = scanner.nextLine();
            System.out.printf("Nhập điểm của sinh viên thứ %d: ", i + 1);
            scores[i] = scanner.nextDouble();
        }

        // Xuất thông tin của các sinh viên, kèm theo học lực
        System.out.println("Thông tin sinh viên:");
        for (int i = 0; i < n; i++) {
            String grade;
            if (scores[i] < 5) {
                grade = "Yếu";
            } else if (scores[i] < 6.5) {
                grade = "Trung bình";
            } else if (scores[i] < 7.5) {
                grade = "Khá";
            } else if (scores[i] < 9) {
                grade = "Giỏi";
            } else {
                grade = "Xuất sắc";
            }
            System.out.printf("Họ tên: %s - Điểm: %.1f - Học lực: %s\n", names[i], scores[i], grade);
        }

        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    // Hoán đổi họ tên
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                    // Hoán đổi điểm
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                }
            }
        }

        // Xuất thông tin sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Họ tên: %s - Điểm: %.1f\n", names[i], scores[i]);
        }
    }
}
