package com.qlsv.control;

import com.qlsv.database.SVAddDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVOutAdd;

public class SVControlAdd {
	//private MemorySVAddDAO svAddDAO;
	private SVAddDAO svAddDAO;
	private SVOutAdd svOutAdd;
	private SVInAdd svInAdd;
	
	public SVControlAdd() {
	}

	public SVControlAdd(SVAddDAO svAddDAO, SVOutAdd svOutAdd, SVInAdd svInAdd) {
		this.svAddDAO = svAddDAO;
		this.svOutAdd = svOutAdd;
		this.svInAdd = svInAdd;
	}
	
	public void add() {
		SinhVien sv;
		//1. gửi thông điệp  đến đối tượng SVInAdd
		sv = svInAdd.input();//nhâp liệu
		//2. gửi thông điệp đến đối tượng SVAddDAO
		svAddDAO.insert(sv);
		
		//.3 gửi thông điệp đến đối tượng SVOutAdd
		svOutAdd.showMessage(sv);
	}
	
	
	
	

}
