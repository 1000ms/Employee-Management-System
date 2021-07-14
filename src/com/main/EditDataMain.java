package com.main;

import com.Dao.EmpDAO;
import com.conn.DBconnect;
import com.entity.Emp;
import java.util.*;

public class EditDataMain {

	public static void Editdata() {
		
		Emp em=new Emp();
		Scanner sc=new Scanner(System.in);
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
		boolean f=dao.editData(em);
		if(f) {
			System.out.println("Data edited sucessfully");
		}
		else {
			System.out.println("Something went wrong on	the server");
		}
	}
	
}
