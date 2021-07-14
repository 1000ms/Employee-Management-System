package com.main;

import com.Dao.EmpDAO;
import java.util.*;
import com.conn.DBconnect;
import com.entity.Emp;

public class retriveData {
	public static void retrieveAll() {
		
		EmpDAO dao= new EmpDAO(DBconnect.getConn());
		
		List<Emp> list=dao.getAllData();
		for(Emp e:list) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getSalary());
		}
		
	}
}
