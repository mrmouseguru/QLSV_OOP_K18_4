package com.qlsv.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.qlsv.entity.SinhVien;

public class FileSVAddDAO implements SVAddDAO {

	@Override
	public void insert(SinhVien sv) {
		// TODO Auto-generated method stub
		FileOutputStream fOS;//
		ObjectOutputStream oOS;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		try {
			
			//lấy danh sách sv từ db
			dsSV = getDSSVFromDB();
			//1.kết nối đến file sinhvien.db
			fOS = new FileOutputStream("sinhvien.db");
			//2. thêm sinh viên vào file sinhvien.db
			oOS = new ObjectOutputStream(fOS);
			
			//thêm sv vào danh sách
			dsSV.add(sv);
			oOS.writeObject(dsSV);//
			//ghi danh sách sinh viên xuống file
			//danh sách có sv mới + sv cũ
			fOS.close();
			oOS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private ArrayList<SinhVien> getDSSVFromDB() {
		FileInputStream fIS;
		ObjectInputStream oIS;
		ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();
		
		try {
			//1.kết nối đến file sinhvien.db
			fIS = new FileInputStream("sinhvien.db");
			//2. lấy dữ liệu từ file
			oIS = new ObjectInputStream(fIS);
			//đổ vào ArrayList
			dsSV = (ArrayList<SinhVien>)oIS.readObject();
			
			fIS.close();
			oIS.close();
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//dsSV = new ArrayList<SinhVien>();

			e.printStackTrace();
		}
		
		return dsSV;
	}

}
