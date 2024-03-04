import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}