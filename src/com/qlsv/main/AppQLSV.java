package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlsv.control.SVControlAdd;
import com.qlsv.control.SVControlPrint;
import com.qlsv.database.FileSVAddDAO;
import com.qlsv.database.MemorySVAddDAO;
import com.qlsv.database.SVPrintDAO;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVMenu;
import com.qlsv.ui.SVOutAdd;
import com.qlsv.ui.SVOutPrint;

public class AppQLSV {

	public static void main(String[] args) {
		//Bước 1
		PrintWriter out;
		SVMenu menu;
		Scanner in;
		String prompt = "->";
		SVControlAdd svControlAdd;
		SVInAdd svInAdd;
		//MemorySVAddDAO svAddDAO;
		FileSVAddDAO fileSVAddDAO;
		SVOutAdd svOutAdd;
		SVControlPrint svControlPrint;
		SVPrintDAO svPrintDAO;
		SVOutPrint svOutPrint;
		
		
		//Bước 3   //Bước 2
		out =     new PrintWriter(System.out);
		in =      new Scanner(System.in);
		//menu =   new SVMenu();
		svInAdd = new SVInAdd(out, in);
		//svAddDAO = new MemorySVAddDAO();
		fileSVAddDAO = new FileSVAddDAO();
		svOutAdd = new SVOutAdd(out);
		svPrintDAO = new SVPrintDAO();
		svOutPrint = new SVOutPrint(out);
		svControlPrint =  new SVControlPrint(svPrintDAO, svOutPrint);
		svControlAdd = new SVControlAdd(fileSVAddDAO, svOutAdd, svInAdd);
				
		//menu =    new SVMenu(out, in, prompt);
		menu = new SVMenu(out, in, prompt, svControlAdd);
		//svConrolPrint = null
		menu.setSVControlPrint(svControlPrint);
		//svConrolPrint = 0001010101010101
		//gửi thông điệp
		out.println("~~~~ Chương trình QLSV ~~~~");
		out.flush();
		
		menu.controlLoop();
	}

}
