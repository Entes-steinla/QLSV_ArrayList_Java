package QLSV;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {

    private String maSV;
    private String hoVaTen;
    private int namSinh;
    private float DTB;

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien(String maSV, String hoVaTen, int namSinh, float DTB) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.DTB = DTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    // in ra thông tin một sinh viên
    @Override
    public String toString() {
        return "maSV:" + maSV + ", hoVaTen:" + hoVaTen + ", namSinh:" + namSinh + ", DTB:" + DTB;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;

        return Objects.equals(this.maSV, other.maSV);
    }

}
