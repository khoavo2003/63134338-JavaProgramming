import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
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
}