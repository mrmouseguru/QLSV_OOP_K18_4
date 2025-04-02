package com.qlsv.ui;

import java.io.PrintWriter;

import com.qlsv.entity.SinhVien;

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
		out.flush();
		//out.println( sv);//toString()
		out.flush();
		
	}
	
	
	

}
