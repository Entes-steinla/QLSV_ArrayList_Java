package QLSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {

    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1. Thêm sinh viên, chèn vào cuối danh sách
    public void themSV(SinhVien sv) {
        this.danhSach.add(sv);
    }

    // 2. In danh sách sinh viên ra màn hình
    public void inDSSV() {
        if (!this.danhSach.isEmpty()) {
            System.out.println("Danh sách sinh viên");
            for (SinhVien sinhVien : danhSach) {
                System.out.println(sinhVien);
            }
        } else {
            System.out.println("Danh sách không có sinh viên");
        }
    }

    // 3. kiểm tra danh sách sinh viên có rỗng hay không
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    // 4. lấy ra số lượng sinh viên trong danh sách
    public int soLuongSV() {
        return this.danhSach.size();
    }

    // 5. làm rỗng dssv
    public void lamRongDSSV() {
        this.danhSach.removeAll(danhSach);
    }

    // 6. kiểm tra sinh viên có tồn tại trong danh sách ko, dựa trên msv
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    // 7. xóa một sinh viên, dựa trên msv
    public boolean xoaSV(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    // 8. tìm kiếm theo tên
    public void timSV(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    // 9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDTB() < sv2.getDTB()) {
                    return 1;
                } else if (sv1.getDTB() > sv2.getDTB()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
    }

}
