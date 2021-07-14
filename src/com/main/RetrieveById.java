package com.main;

import com.Dao.EmpDAO;
import com.conn.DBconnect;
import com.entity.Emp;

public class RetrieveById {

	public static void Retrieveid(int id) {

		EmpDAO dao = new EmpDAO(DBconnect.getConn());
		Emp em=dao.getInfo(id); 
		if(em==null) {
			
			System.out.println("Employee not available"); 
			
		} 
		else {
			
			System.out.println(em.getId()+" "+em.getName()+" "+em.getAddress()+" "+em.getSalary());
		
		}
		  
		 

	}
}
