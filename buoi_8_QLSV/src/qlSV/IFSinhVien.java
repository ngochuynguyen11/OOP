package qlSV;

import java.util.List;

public interface IFSinhVien {

    // NHÓM 1: CRUD
    boolean them(SinhVien sv);
    boolean sua(String maSV, SinhVien svMoi);
    boolean xoa(String maSV);
    boolean xoaTatCa();

    // NHÓM 2: TÌM KIẾM
    List<SinhVien> layTatCa();
    SinhVien timTheoMa(String maSV);
    List<SinhVien> timTheoTen(String tuKhoa);
    List<SinhVien> timTheoLop(String lop);
    List<SinhVien> timTheoLoai(String loai);
    List<SinhVien> timTheoMon(MonHoc monHoc);

    // NHÓM 3: THỐNG KÊ
    int tongSoLuong();
    double tongThanhTien();

    // NHÓM 4: SẮP XẾP
    List<SinhVien> sapXepTheoTen();
    List<SinhVien> sapXepTheoThanhTienGiamDan();
}