package com.main;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
			System.out.println("Enter your choice");
			System.out.println("1-Insert an employee in the database");
			System.out.println("2-Retrieve Employee by ID");
			System.out.println("3-Retrieve entire Database");
			System.out.println("4-Edit an Employee");
			System.out.println("5-Delete an Employee");
			System.out.println("6-Exit");
			Scanner sc=new Scanner(System.in);
			String ch=sc.next();
			switch(ch) {
			
			case "1":{
				System.out.println();
				InsertDataMain.Insert();
				System.out.println();
				break;
			}
			
			case "2":{
				int id;
				System.out.println("Enter the employee's ID");
				id=sc.nextInt();
				System.out.println();
				RetrieveById.Retrieveid(id);
				System.out.println();
				break;
			}
			
			case "3":{
				
				System.out.println();
				retriveData.retrieveAll();
				System.out.println();
				break;
			}
			
			case "4":{
				
				System.out.println();
				EditDataMain.Editdata();
				System.out.println();
				break;
			}
			
			case "5": {
				
				DeleteMain.delete();
				System.out.println();
				break;
				
			}
			
			case "6":{
				
				System.out.println();
				System.exit(0);
				break;
				
			}
			
			default:{
				System.out.println();
				System.out.println("INVALID CHOICE...PLEASE ENTER AGAIN");
				System.out.println();
			}
			
			}
			
		}
		
	}
}
