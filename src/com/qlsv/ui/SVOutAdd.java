package com.qlsv.ui;

import java.io.PrintWriter;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class SVOutAdd {
	private PrintWriter out;

	public SVOutAdd() {
	}

	public SVOutAdd(PrintWriter out) {
		this.out = out;
	}
	
	public void showMessage(SinhVien sv) {
		
		//
		out.println("Đã thêm thành công 1 SV!");
		out.println("[MÃ SV]: " + sv.getMaSV());
		out.flush();
		out.println("[TÊN SV]: " + sv.getHoTen());
		out.flush();
		out.println("[NGÀNH]: " + sv.getNganh());
		out.flush();
		out.println("[ĐIỂM]: " + sv.tinhDiem());//đa hình
		out.flush();
		out.println("[HỌC LỰC]: " + sv.tinhHocLuc());
		//thông tin chi tiết
		// kiểm tra ngành
		//2 cách
		//1. kiểm tra bằng field ngành
		if(sv.getNganh().equalsIgnoreCase("PM")) {
			
		}
		
		//cách 2
		if(sv instanceof SinhVienPM) {
			//điểm java
			//điểm css 
			//điểm html
			SinhVienPM svPM;
			svPM = (SinhVienPM)sv;
			out.println("[ĐIỂM JAVA]" + svPM.getDiemJava());
		}
		
		if(sv instanceof SinhVienKT) {
			//điểm marketing
			//điểm sales
		}
		
		
		out.flush();
		//out.println( sv);//toString()
		out.flush();
		
	}
	
	
	

}
