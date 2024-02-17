import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int N = scanner.nextInt();
        
        boolean ok = true;
        for (int i = 2; i < N - 1; i++) {
            if (N % i == 0) {
                ok = false;
                break;
            }
        }
        
        if (ok && N > 1) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }
    }
}
