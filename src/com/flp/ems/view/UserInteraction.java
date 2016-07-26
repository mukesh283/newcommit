package com.flp.ems.view;
import java.util.HashMap;
import java.util.Scanner;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;


public class UserInteraction {

	//ADDING EMPLOYEE
	public static boolean AddEmployee()
	{
		HashMap<Integer,Object> hmap= new HashMap<Integer,Object>();
		Scanner s=new Scanner(System.in);
		
		//NAME INPUT
		System.out.println("Enter the employee name (alphanumeric only)");
		String Name=s.next();
		if(Validate.validateName(Name))
		hmap.put(1,Name);
		else	
		{System.out.println("Invalid Name");return false;}
		
		//KINID INPUT
		System.out.println("Enter the kin_id(alphanumeric and specialchar( _ ))");
		String Kin_id=s.next();
		if(Validate.validateKin_id(Kin_id))
			hmap.put(2,Kin_id);
		else
		{System.out.println("Invalid Kin_id");return false;}
		
		//EMAILID INPUT
		System.out.println("Enter the Email_id");
		String Email_id=s.next();
		if(Validate.validateemail_id(Email_id))
			hmap.put(3,Email_id);
		else
		{System.out.println("Enter a valid email id");return false;}
		
		//PHONE NO
		System.out.println("Enter the phone number() ");
		String Phone_no=s.next();
		if(Validate.validatePhone_no(Phone_no))
			hmap.put(4,Phone_no);
		else
		{System.out.println("Enter a correct phone no");
		return false;}
		
		//DATE OB BIRTH INPUT
		System.out.println("Enter the Date Of Birth(dd-mm-yyyy format)");
		String Dob=s.next();
		if(Validate.validateDate_of_birth(Dob))
			hmap.put(5,Dob);
		else
			{System.out.println("Invalid Date of birth");return false;}
	
		//DOJ OB JOINING INPUT
		System.out.println("Enter the Date Of Joining(dd-mm-yyyy format)");
		String Doj=s.next();
		if(Validate.validateDate_of_Joining(Doj))
			hmap.put(6,Doj);
		else
			{System.out.println("Invalid Date of joining");return false;}
		
		//ADDRESS INPUT
		System.out.println("Enter the Address(only alphanumeric and special char(- ,))");
		String Address=s.next();
		if(Validate.validateaddress(Address))
			hmap.put(7,Address);
		else
			{System.out.println("Invalid Address");return false;}
		
		//DEPARTMENT SELECTION
		System.out.println("Select the Department number");
		System.out.println("1-FS             2-Non-FS    ");
		int Department_id=s.nextInt();
		if(Validate.validateDepartment_id(Department_id))
			hmap.put(8,Department_id);
		else
			{System.out.println("Enter the valid Department Number");return false;}
		
		//PROJECT SELECTION
		System.out.println("select the project number");
		int Project_id;
		switch(Department_id)
		{
		case 1:
			System.out.println("50- java    51-Python ");
			Project_id=s.nextInt();
			if(Validate.validateProject_id(Project_id))
			hmap.put(9,Project_id);
			else
			{System.out.println("Invalid Project No.");return false;}
			break;
		case 2:
			System.out.println("52- scala    53-html");
			Project_id=s.nextInt();
			if(Validate.validateProject_id(Project_id))
			hmap.put(9,Project_id);
			else
			{System.out.println("Invalid Project No.");return false;}
			break;
		}
	
		//ROLE SELECTION
		System.out.println("select the role number");
		System.out.println("100- developer    101-Tester    102-Database  103-Maintainence ");
		int role_id=s.nextInt();
		if(Validate.validateRole_id(role_id))
		hmap.put(10,role_id);
		else
		{System.out.println("Invalid Role No");return false;}

		
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.AddEmployee(hmap);
		
		return true;	
}
	public static void  ModifyEmployee()
	{
		System.out.println("Enter the employee Kin_id to modify");
	 	Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		System.out.println("1-Name\n3-Email_id\n4-Phone no\n5-Date_of_Birth\n6-Date_of Joining\n7-address\n8-department\n9-project\n10-role");
		int input=s.nextInt();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		switch(input)
		 {
		 case 1:System.out.println("Enter the employee name (alphanumeric only)");
		 		String Name=s.next();
		 		if(Validate.validateName(Name))
		 		empsvc.ModifyEmployee(Kin_id,input,Name);
		 		else
		 		System.out.println("Invalid Name");break;
		 
		 /*case 2:System.out.println("Enter the kin_id(alphanumeric and specialchar( _ ))");
				String kin_id=s.next();
				if(Validate.validateKin_id(kin_id))
					empsvc.ModifyEmployee(Kin_id,input,kin_id);
				else
				System.out.println("Invalid Kin_id");break;
		 */
		 case 3:System.out.println("Enter the Email_id");
				String Email_id=s.next();
				if(Validate.validateemail_id(Email_id))
					empsvc.ModifyEmployee(Kin_id,input,Email_id);
				else
				System.out.println("Enter a valid email id");break;
				
		 case 4:System.out.println("Enter the phone number()");
				String phone_no=s.next();
				if(Validate.validatePhone_no(phone_no))
					empsvc.ModifyEmployee(Kin_id,input,phone_no);
				else
				System.out.println("Enter a correct phone no");break;
				
		 case 5:System.out.println("Enter the Date Of Birth(dd-mm-yyyy format)");
				String Dob=s.next();
				if(Validate.validateDate_of_birth(Dob))
					empsvc.ModifyEmployee(Kin_id,input,Dob);
				else
					System.out.println("Invalid Date of birth");break;
			
		 case 6:System.out.println("Enter the Date Of Joining(dd-mm-yyyy format)");
				String Doj=s.next();
				if(Validate.validateDate_of_Joining(Doj))
					empsvc.ModifyEmployee(Kin_id,input,Doj);
				else
					System.out.println("Invalid Date of joining");break;
				
		 case 7:System.out.println("Enter the Address(only alphanumeric and special char(- ,))");
				String address=s.next();
				if(Validate.validateaddress(address))
					empsvc.ModifyEmployee(Kin_id,input,address);
				else
					System.out.println("Invalid Address");break;	 
		 default:
			 	System.out.println("Invalid Input");break;
		 }
	}
	
	public static void RemoveEmployee()
	{
		System.out.println("Enter the kin_id to remove employee");
		Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.RemoveEmployee(Kin_id);
	
	}
	
	public static void SearchEmployee(){
		
		System.out.println("SEARCH BY EMAIL OR KIN_ID");
		System.out.println("1------BY EMAIL");
		System.out.println("2------BY KINID");
		System.out.println("3------BY NAME");
		Scanner s=new Scanner(System.in);
		int choice = s.nextInt();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		switch (choice) {
		case 1:System.out.println("ENTER THE EMAIL ID");
			String email = s.next();
			empsvc.SearchEmployee(email);
			break;
		case 2:System.out.println("ENTER THE KINID ");
			String kinid  = s.next();
			empsvc.SearchEmployee(kinid );
			break;
		case 3:System.out.println("ENTER THE NAME ");
		   	String name = s.next();
		   	empsvc.SearchEmployee(name );
		    break;
		default:
			System.out.println("Invalid Input");
		}

	}
	
	public static void GetAllEmployee(){
		System.out.println("All Employee list");
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.getAllEmployee();
	}
	
}
