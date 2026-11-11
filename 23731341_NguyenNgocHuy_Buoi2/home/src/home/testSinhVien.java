package home;

import java.util.Scanner;

public class testSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sv1: thông tin của mình
        sinhVien sv1 = new sinhVien(
            11111,
            "Nguyen Hoang Anh",
            6.50,
            8.50
        );

        // sv2: thông tin bạn thân
        sinhVien sv2 = new sinhVien(
            12346,
            "Tran Van B",
            7.5,
            8.0
        );

        // sv3: constructor mặc định
        sinhVien sv3 = new sinhVien();

        // Nhập thông tin sv3
        System.out.print("Nhap ma sinh vien: ");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem LT: ");
        double diemLT = sc.nextDouble();

        System.out.print("Nhap diem TH: ");
        double diemTH = sc.nextDouble();

        // Gán bằng setter
        sv3.setMaSV(maSV);
        sv3.setHoTen(hoTen);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        // In bảng
        System.out.println("\nDANH SACH SINH VIEN");
        System.out.printf(
            "%-10s %-30s %5s %5s %5s%n",
            "MSSV", "Ho ten", "LT", "TH", "TB"
        );

        System.out.println(
            "---------------------------------------------------------------------"
        );

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
