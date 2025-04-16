package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class MemorySVAddDAO implements SVAddDAO {

	
	
	
	//constructor
	//Java sẽ tự tạo một constructor mặc định
	@Override
	public void insert(SinhVien sv) {
		//gọi hàm static
		MemorySVDB.insert(sv);
	}

}
