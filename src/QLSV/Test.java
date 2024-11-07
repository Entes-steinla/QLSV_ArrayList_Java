package QLSV;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("=====MENU=====");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println("1.Thêm sinh viên vào danh sách.");
            System.out.println("2.In danh sách sinh viên ra màn hình.");
            System.out.println("3.Kiểm tra danh sách có rỗng hay không.");
            System.out.println("4.Lấy ra số lượng sinh viên trong danh sách.");
            System.out.println("5.Làm rỗng danh sách sinh viên.");
            System.out.println("6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
            System.out.println("7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
            System.out.println("8.Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
            System.out.println("9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
            System.out.println("0.Thoát khỏi chương trình");

            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = sc.nextLine();
                    System.out.print("Nhập họ tên sinh viên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.print("Nhập điểm trung bình: ");
                    float dtb = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSV, hoTen, namSinh, dtb);
                    dssv.themSV(sv);
                    break;
                case 2:
                    dssv.inDSSV();
                    break;
                case 3:
                    if (dssv.kiemTraDanhSachRong()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        System.out.println("Danh sách có sinh viên");
                    }
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên có trong danh sách là: " + dssv.soLuongSV());
                    break;
                case 5:
                    System.out.println("Làm rỗng danh sách sinh viên");
                    dssv.lamRongDSSV();
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên: ");
                    maSV = sc.nextLine();
                    sv = new SinhVien(maSV);
                    System.out.println("Kiểm tra sinh viên có trong danh sách " + dssv.kiemTraTonTai(sv));
                    break;
                case 7:
                    System.out.print("Nhập mã sinh viên: ");
                    maSV = sc.nextLine();
                    sv = new SinhVien(maSV);
                    System.out.println("xóa sinh viên có trong danh sách " + dssv.xoaSV(sv));
                    break;
                case 8:
                    System.out.print("Nhập họ tên sinh viên: ");
                    hoTen = sc.nextLine();
                    dssv.timSV(hoTen);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDSSV();
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }

}
