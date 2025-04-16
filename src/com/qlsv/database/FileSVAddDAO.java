package com.qlsv.database;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.qlsv.entity.SinhVien;

public class FileSVAddDAO implements SVAddDAO {

	@Override
	public void insert(SinhVien sv) {
		// TODO Auto-generated method stub
		FileOutputStream fOS;//
		ObjectOutputStream oOS;
		try {
			//1.kết nối đến file sinhvien.db
			fOS = new FileOutputStream("sinhvien.db");
			//2. thêm sinh viên vào file sinhvien.db
			oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(sv);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
