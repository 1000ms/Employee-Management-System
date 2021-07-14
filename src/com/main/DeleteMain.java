package com.main;

import com.Dao.EmpDAO;
import java.util.*;

import com.conn.DBconnect;

public class DeleteMain {
	public static void delete() {
		
		EmpDAO dao=new EmpDAO(DBconnect.getConn());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of the employee to be deleted");
		int id=sc.nextInt();
		boolean f=dao.deleteData(id);
		if(f) {
			System.out.println("Data deleted successfully");
		}
		else {
			System.out.println("Employee with the entered ID doesn't exist");
		}
	}
}
