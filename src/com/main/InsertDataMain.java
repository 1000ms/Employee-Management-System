package com.main;
import java.sql.*;
import java.util.*;

import com.Dao.EmpDAO;
import com.conn.DBconnect;
import com.entity.Emp;

public class InsertDataMain {
	public static void Insert() {
		Connection conn=DBconnect.getConn();
		
		Scanner sc=new Scanner(System.in);
		Emp em=new Emp();

		System.out.println("Enter the ID of the Employee:");
		int id=sc.nextInt();
		em.setId(id);
		
		System.out.println("Enter the name of the Employee:");
		String name=sc.next();
		em.setName(name);
		
		System.out.println("Enter the address of the Employee:");
		String adr=sc.next();
		em.setAddress(adr);
		
		System.out.println("Enter the salary of the Employee:");
		int salary=sc.nextInt();
		em.setSalary(salary);
		
		
		
		
		EmpDAO dao=new EmpDAO(DBconnect.getConn());
		boolean f=dao.dataInsert(em);
		if(f) {
			System.out.println("Data inserted sucessfully in the database");
		}
		else {
			System.out.println("Something went wrong on server...");
		}
		
	}
}
