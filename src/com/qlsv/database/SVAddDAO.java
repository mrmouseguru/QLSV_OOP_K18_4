package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class SVAddDAO {
	
	
	//constructor
	//Java sẽ tự tạo một constructor mặc định
	
	public void insert(SinhVien sv) {
		//gọi hàm static
		MemorySVDB.insert(sv);
	}

}
