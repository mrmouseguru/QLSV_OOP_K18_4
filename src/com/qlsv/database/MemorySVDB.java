package com.qlsv.database;

import java.util.ArrayList;

import com.qlsv.entity.SinhVien;
import com.qlsv.entity.SinhVienKT;
import com.qlsv.entity.SinhVienPM;

public class MemorySVDB {
	private static ArrayList<SinhVien> dbSV;
	
	//khối code static
	static {
		dbSV = new ArrayList<SinhVien>();
		//tạo dữ liệu sẵn có cho DB
		SinhVienPM svPM1 = new SinhVienPM(111, "Le Van Teo", 
				"PM", null, 4, 4, 4);
		SinhVienPM svPM2 = new SinhVienPM(222, "Le Van Tu", 
				"PM", null, 9, 9, 1);
		SinhVienKT svKT1 = new SinhVienKT(333, "Nguyen Thi Meo", 
				"KT", null, 7, 8);
		SinhVienKT svKT2 = new SinhVienKT(444, "Nguyen Thi Suu", 
				"KT", null, 2, 2);
		dbSV.add(svPM1);
		dbSV.add(svPM2);
		dbSV.add(svKT1);
		dbSV.add(svKT2);
		
		
	}
	
	public static void insert(SinhVien sv) {
		dbSV.add(sv);
	}

}
