package tongSoNguyenDuong;

import java.util.Scanner;

public class TongSoNguyenDuong {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println(" Nhap so luong so can tinh tong :");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong la :" + sum);
    }
}
