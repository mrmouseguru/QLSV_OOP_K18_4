package com.qlsv.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class SVMenu {

	PrintWriter out;
	Scanner in;
	String prompt;

	public SVMenu() {
	}

//	SVMenu(PrintWriter _out,
//	Scanner _in,
//	String _prompt){
//		out = _out;
//		in = _in;
//		prompt = _prompt;
//	}

	public SVMenu(PrintWriter out, Scanner in, String prompt) {
		this.out /* field */ = out /* tham số */;
		this.in = in;
		this.prompt = prompt;
	}

	public void controlLoop() {
		out.println("hãy gõ lệnh \"help\" để được hỗ trợ!!");
		out.flush();
		while (true) {
			String command;// lệnh
			out.print(prompt);
			out.flush();
			command = in.nextLine();// dừng và chờ người dùng nhập lệnh
									// [HELP], [ADD], [PRINT], [ABOUT], [QUIT]
			// cắt khoảng trắng ở 2 đầu command
			command = command.trim();

			// kiểm tra
			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
		}
	}
	
	private void help() {
		//code
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một chuyến xe");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[QUIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
	}

}
