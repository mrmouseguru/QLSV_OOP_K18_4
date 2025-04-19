package com.qlsv.ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class SVInAdd {

	private PrintWriter out;
	private Scanner in;

	public SVInAdd() {
	}

	public SVInAdd(PrintWriter out, Scanner in) {
		this.out = out;
		this.in = in;
	}

	public SinhVien input() {

		int maSV;
		String hoTen;
		String nganh;
		Date ngaySinhJava;
		String ngaySinh;
		SinhVien sv = null;

		out.print("[MÃ SINH VIÊN]:");
		out.flush();
		maSV = in.nextInt();
		in.nextLine();
		out.print("[HO TEN SV]:");
		out.flush();

		hoTen = in.nextLine();
		out.print("[NGAY SINH, dd/MM/yyyy]:");
		out.flush();

		ngaySinh = in.nextLine();
		// chuyen ngay kieu chuoi
		// thanh ngay kieu Java
		ngaySinhJava = convertStringtoDate(ngaySinh);
		
		out.print("[NGANH HOC \"KT\" / \"PM\"]:");
		out.flush();

		nganh = in.nextLine();
		// kiem tra xem user nhap nganh gi?
		if ("KT".equalsIgnoreCase(nganh)) {
			sv = inputSVKT(maSV, hoTen, "KT", ngaySinhJava);
		}

		if ("PM".equalsIgnoreCase(nganh)) {
			sv = inputSVPM(maSV, hoTen, nganh, ngaySinhJava);
		}

		return sv;

	}
	
	
	private Date convertStringtoDate(String date) {
		Date ngaySinhJava = null;
		SimpleDateFormat dateFormat;
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinhJava =  dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ngaySinhJava;
	}

	private SinhVien inputSVKT(int maSV, String hoTen, String nganh, Date ngaySinh) {
		double diemMarketing;
		double diemSale;

		out.print("[DIEM MARKETING]:");
		out.flush();

		diemMarketing = in.nextDouble();

		out.print("[DIEM SALES]:");
		out.flush();

		diemSale = in.nextDouble();

		SinhVienKT svKT = new SinhVienKT(maSV, hoTen, nganh, ngaySinh, diemMarketing, diemSale);

		return svKT;

	}

	private SinhVien inputSVPM(int maSV, String hoTen, String nganh, Date ngaySinh) {
		// điêm java
		// điểm css
		// điểm html
		double diemJava, diemCss, diemHtml;
		// nhập thông tin phân mềm
		// nhập vào htong thin sinh viên phần mềm
		out.print("[ĐIỂM JAVA]:");
		out.flush();
		diemJava = in.nextDouble();
		out.print("[ĐIỂM CSS]:");
		out.flush();
		diemCss = in.nextDouble();
		out.print("[ĐIỂM HTML]:");
		out.flush();
		diemHtml = in.nextDouble();
		SinhVienPM svPM = new SinhVienPM(maSV, hoTen, nganh, ngaySinh,
				diemJava, diemCss, diemHtml);
		return svPM;

	}

}
