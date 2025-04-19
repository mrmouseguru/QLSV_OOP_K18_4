package com.qlsv.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class SinhVien implements Serializable{
	
	private int maSV;
	private String hoTen;
	private String nganh;
	private Date ngaySinh;
	
	public void setHoTen(String newName) {
		hoTen = newName;
	}
	
	//getter
	public int getMaSV() {
		return this.maSV;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public String getNganh() {
		return this.nganh;
	}
	
	public Date getNgaySinh() {
		return this.ngaySinh;
	}
	
	protected SinhVien() {}
	
	protected SinhVien(int maSV, String hoTen, String nganh, Date ngaySinh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.ngaySinh = ngaySinh;
	}
	
	public abstract double tinhDiem();
	
	//body
//	{
//		return 0;
//	}
	
	public String tinhHocLuc() {
		
		double diemTB = tinhDiem();
		if (diemTB < 5) {
            return "Yếu";
        } else if (diemTB < 6.5) {
            return "Trung bình";
        } else if (diemTB < 7.5) {
            return "Khá";
        } else if (diemTB < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
		
	}
	
	public static void main(String[] args) {
		//new SinhVien(0, null, null, null);
		new SinhVienKT(0, null, null, null, 0, 0);
		new SinhVienPM(0, null, null, null, 0, 0, 0);
		
	}
	
	

}
