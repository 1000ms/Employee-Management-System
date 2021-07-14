package com.Dao;
import java.sql.*;
import java.util.*;

import com.entity.Emp;

public class EmpDAO {
	
	private Connection conn;
	
	public EmpDAO(Connection conn){
		super();
		this.conn=conn;
	}
	
	public boolean dataInsert(Emp emp) {
		
		boolean f=false;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("INSERT INTO Emp values(?,?,?,?)");
			ps.setInt(1,emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			ps.setString(4,emp.getAddress());
			int a=ps.executeUpdate();
			if(a==1) {
				f=true;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public boolean editData(Emp emp) {
		boolean f=false;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("UPDATE Emp SET name=?,address=?,salary=? WHERE id=?");
			ps.setString(1,emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setInt(4, emp.getId());
			ps.setInt(3, emp.getSalary());
			int a=ps.executeUpdate();
			if(a==1) f=true; 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	public boolean deleteData(int id) {
		boolean f=false;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("DELETE FROM Emp WHERE id=?");
			ps.setInt(1, id);
			int a=ps.executeUpdate();
			if(a==1) f=true; 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	public Emp getInfo(int id) {
		Emp obj=null;
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM Emp WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				obj=new Emp();
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setSalary(rs.getInt(3));
				obj.setAddress(rs.getString(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return obj;
	}
	
	public List<Emp> getAllData(){
		
		List<Emp> list=new ArrayList<Emp>();
		Emp em=null;
		try {
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM Emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				em=new Emp();
				em.setId(rs.getInt(1));
				em.setName(rs.getString(2));
				em.setSalary(rs.getInt(3));
				em.setAddress(rs.getString(4));
				list.add(em);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
}





























































