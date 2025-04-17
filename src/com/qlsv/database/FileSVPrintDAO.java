package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVPrintDAO extends SVPrintDAO{

	@Override
	public ArrayList<SinhVien> getDSSV() {
		// TODO Auto-generated method stub
		FileInputStream fIS;
		ObjectInputStream oIS;
		SinhVien sv;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		
		try {
			//1.kết nối đến file sinhvien.db
			fIS = new FileInputStream("sinhvien.db");
			//2. lấy dữ liệu từ file
			oIS = new ObjectInputStream(fIS);
			//đổ vào ArrayList
			dsSV = (ArrayList<SinhVien>)oIS.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
		//	dsSV = new ArrayList<SinhVien>();
			e.printStackTrace();
		}
		
		return dsSV;
	}

}
