package com.qlsv.control;

import java.util.ArrayList;

import com.qlsv.database.SVPrintDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVOutPrint;

public class SVControlPrint {
	
	private SVPrintDAO svPrintDAO;
	private SVOutPrint svOutPrint;
	
	public SVControlPrint(SVPrintDAO svPrintDAO, SVOutPrint svOutPrint) {
		this.svPrintDAO = svPrintDAO;
		this.svOutPrint = svOutPrint;
	}
	
	public void printAllSV() {
		ArrayList<SinhVien> dsSV;
		//gửi thông điệp đến đơi tượng SVPrintDAO
		dsSV = svPrintDAO.getDSSV();
		
		//gửi thông điệp cho đối tượng SVOutPRint
		svOutPrint.showDSSV(dsSV);
	}
	
	

}
