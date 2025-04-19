package com.qlsv.ui;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.qlsv.database.MemorySVDB;
import com.qlsv.entity.SinhVien;

public class SVOutPrint {
	
	private PrintWriter out;
	
	public SVOutPrint(PrintWriter out) {
		this.out  = out;
	}
	
	public void showDSSV(ArrayList<SinhVien> dsSV) {
		out.printf("%-10s %-20s %-10s %-10s %-5s %-10s\n","Mã SV",
				"Họ tên SV", "Ngành",
				"Ngày sinh", "Điểm", "Học lực");
		out.flush();
		for (SinhVien sinhVien : dsSV) {
			out.printf("%-10d %-20s %-10s %-10s %-5.2f %-10s\n",
					sinhVien.getMaSV(),
					sinhVien.getHoTen(), 
					sinhVien.getNganh(),
					convertDatetoString(sinhVien.getNgaySinh()), //java.util.Date
					sinhVien.tinhDiem(), 
					sinhVien.tinhHocLuc());
			out.flush();
		}
	}
	
	private String convertDatetoString(Date date) {
		String ngaySinh = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ngaySinh =  dateFormat.format(date);
		return ngaySinh;
	}
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		SVOutPrint svOutPrint = new SVOutPrint(out);
		svOutPrint.showDSSV(MemorySVDB.getDSSV());
	}

}
