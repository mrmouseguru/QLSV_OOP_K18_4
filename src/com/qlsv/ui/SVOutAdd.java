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
		out.flush();
		out.println( sv);
		out.flush();
		
	}
	
	
	

}
