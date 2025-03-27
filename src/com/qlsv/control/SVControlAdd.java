package com.qlsv.control;

import com.qlsv.database.SVAddDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVOutAdd;

public class SVControlAdd {
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
		sv = svInAdd.input();//nhâp liệu
		svAddDAO.insert(sv);
	}
	
	
	
	

}
