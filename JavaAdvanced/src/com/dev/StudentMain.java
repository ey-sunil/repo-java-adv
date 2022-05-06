package com.dev;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;


public class StudentMain {

	private static Set<Student> lstOne;   

	private static Map<String, Student> mpObj = new HashMap<>();

	private static Map<Student, Student> mpObjOne = new HashMap<>();

	static {
		try {
			lstOne = StudentData.populateStudentsInfo(SmsConstants.STUD_INSTANCES_DYNAMIC);
			lstOne.forEach(std->
			{
				mpObj.put(std.getId(), std);
				mpObjOne.put(std, std);
			});
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			print(); 

			while(true) {
				System.out.print("Enter User's Choice:");  
				String userOption = sc.next();

				switch(userOption) { 

				case "1":
					viewStudents();
					while(true) {
						System.out.println("Do you want to view student again ? Y OR N");
						String option = sc.next();	
						if(option.equalsIgnoreCase("Y")) {
							viewStudents(); 
						}else if(option.equalsIgnoreCase("N")) { 
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}

					}
					break;

				case "2":
					viewWithArguments(); 
					while(true) {
						System.out.println("Do you want to view student with arguments again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							viewWithArguments();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}

					}
					break;
				case "3":
					viewIndividualStudent();
					while(true) {
						System.out.println("Do you want to view individual student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							viewIndividualStudent();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;

				case "4":
					verifyStudentObjIdentityThroughMap();
					while(true) {
						System.out.println("Do you want to view student identity again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							verifyStudentObjIdentityThroughMap();   
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;

				case "5":
					addStudent(); 
					while(true) {
						System.out.println("Do you want to Add Student again ? Y OR N");
						String option = sc.next(); 
						if(option .equalsIgnoreCase("Y")) {
							addStudent(); 
						}else if(option.equalsIgnoreCase("N"))  {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;
					
				case "6":
					updateStudent();
					while(true) {
						System.out.println("Do you want to Update student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							updateStudent(); 
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "7":
					deleteStudent();
					while(true) {
						System.out.println("Do you want to delete student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							deleteStudent();  
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;
					
				case "8":
					searchStudent();
					while(true) {
						System.out.println("Do you want to Search student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							searchStudent();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "9":
					sortStudent();
					while(true) {
						System.out.println("Do you want to sort student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							sortStudent();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "10":
					pendingFees();
					while(true) {
						System.out.println("Do you want to view pending fees of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							pendingFees(); 
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;
					
				case "11":
					bunksInDays();
					while(true) {
						System.out.println("Do you want to view the bunks in days of a student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							bunksInDays();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "12":
					maximumFees();
					while(true) {
						System.out.println("Do you want to view pending with maximum fees of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							maximumFees();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;
					
				case "13":
					minimumFees();
					while(true) {
						System.out.println("Do you want to view the minimum fees of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							minimumFees();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "14":
					studentsCount();
					while(true) {
						System.out.println("Do you want to See the Count of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							studentsCount();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "15":
					 mapByAttendance();
					while(true) {
						System.out.println("Do you want to view the sort of attendance  again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							 mapByAttendance();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break;
					
				case "16":
					mapBySubmittedFees();
					while(true) {
						System.out.println("Do you want to view the Submitted fees of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							mapBySubmittedFees();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "17":
					mapByUpdateSubmittedFees();
					while(true) {
						System.out.println("Do you want to view the updated submitted fees of student again ? Y OR N");
						String oprStatus = sc.next();
						if(oprStatus.equalsIgnoreCase("Y")) {
							mapByUpdateSubmittedFees();
						}else if(oprStatus.equalsIgnoreCase("N")) {
							break;
						}else {
							System.out.println("Please provide a valid input..");
						}
					}
					break; 
					
				case "quit":
					System.out.println("Exit From Student Management System"); 
					break;

				default:
					System.out.println("No matched operations found");
					break;

				}

				if(userOption.equalsIgnoreCase("quit")) { 
					break;
				}else {
					print();
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}

	}

	
	private static void viewStudents() throws Exception {
		if(lstOne==null || lstOne.isEmpty())
			throw new Exception("Student data list is empty or null..");
		
		for(Student st:lstOne)
			System.out.println(st);

		System.out.println("All Students are listed"); 
	}
	
	private static Student viewIndividualStudent()
	{
		Scanner it=new Scanner(System.in);
		System.out.print("Enter Student id/roll no:"); 
		String roll=it.next();
		Student sd=mpObj.get(roll);
		System.out.println(sd); 
		return sd; 
	}
	
	private static void addStudent() {
		
		Student std=new Student();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Add Student Details");
		
		String uniqueID = UUID.randomUUID().toString();
		std.setId(uniqueID);
		std.setRollNumber(std.getId()); 
		
		System.out.print("Enter Student Name:"); 
		String name=sc1.next(); 
		std.setName(name);
		
		System.out.print("Enter Student Age:");
		int age=sc1.nextInt(); 
		std.setAge(age);
		
		System.out.print("Enter Student email:");
		String email=sc1.next();
		std.setEmail(email); 
		
		System.out.print("Enter Student coursename:");
		String coursename=sc1.next(); 
		std.setCourseName(coursename); 
		
		System.out.print("Enter Student address:");
		String address=sc1.next(); 
		std.setAddress(address); 
		
		System.out.print("Enter Student's submitted fees:");
		String submittedFees=sc1.next();  
		std.setSubmittedFees(Double.valueOf(submittedFees)); 
		
		System.out.print("Enter Student's previous Education:");
		String prevEducation=sc1.next();  
		std.setPrevEducation(prevEducation); 
		
		System.out.print("Enter Student's Result Status:");
		String result=sc1.next();
		std.setResultStatus(result); 
		
		System.out.print("Enter Student's Attendance:");
		String attendance=sc1.next();
		std.setAttendance(Integer.valueOf(attendance));
		
		System.out.print("Enter Student's Total Course Fees:");
		String total=sc1.next();
		std.setTotalCourseFees(Double.valueOf(total));
		
		System.out.print("Enter Student's duration of course:");
		String duration=sc1.next();
		std.setDurationOfCourse(Integer.valueOf(duration)); 
		
		System.out.print("Enter Student's Fee Status:");
		String feeStatus=sc1.next();
		std.setFeeStatus(feeStatus); 
		
		System.out.print("Enter Student's Course Year:");
		String courseYear=sc1.next(); 
		std.setCourseYear(courseYear); 
		
		boolean studRegistration = lstOne.add(std);
		mpObj.put(std.getId(),std);  
		if(studRegistration) 
			System.out.println("Student was added and registered successfully");
		else
			System.out.println("Student registration was unsuccessful");  		
	}


	private static void updateStudent() throws Exception{
		Scanner sc=new Scanner(System.in);
		boolean updStatus = true;
		viewStudents();
		System.out.println("Please provide the student id/roll no to update the student..");
		String stdId = sc.next();
		Student s = mpObj.get(stdId); 
		
		if(s==null)
			throw new Exception("Student information was not found..");
		
		boolean isStudObj = selectAndInputStudentFieldsForEdit(s);
				
		if(isStudObj) { 
			updStatus = lstOne.add(s);
		}
		
		if(!updStatus)
			System.out.println("Student was updated successfully..");
		else
			System.out.println("Updation was unsuccessful..");
		
		viewStudents();
	}
	
	private static boolean selectAndInputStudentFieldsForEdit(Student s) throws Exception {
		Scanner sc=new Scanner(System.in);
		Map<Integer, String> mpObj = new HashMap<>();
		boolean isStudObj = true; 
		while(true) {
			printStudFieldSelInstructions();  

			String regex = "\\d+";
			String str = sc.next();
			while(!str.matches(regex)) {
				System.out.println("Invalid input..Please select one of the below numbers only..");
				print();
				str = sc.next();
			}
			
			Integer field = Integer.valueOf(str);
			
			while(field<1 || field>13) {
				System.out.println("Invalid input.Please select one of numbers in below range..");
				printStudFieldSelInstructions();
				field = sc.nextInt();
			}
			
			System.out.println("Please input your value for selected student property..");
			String val = sc.next();
			
			mpObj.put(field, val);		 	
			
			System.out.println("do you want to update any more field..? Y OR N");
			
			String usrStatus = sc.next();
			
			if(usrStatus.equalsIgnoreCase("Y"))
				continue;
			else if(usrStatus.equalsIgnoreCase("N"))
				break;
			else
				System.out.println("Invalid input..");
		}
		
		for(int fieldSel:mpObj.keySet()) {
			switch(fieldSel){
				case 1:
					s.setName(mpObj.get(fieldSel));
					break;
				case 2:
					s.setAge(Integer.valueOf(mpObj.get(fieldSel))); 
					break;
				case 3:
					s.setEmail(mpObj.get(fieldSel));
					break;
				case 4:
					s.setCourseName(mpObj.get(fieldSel));
					break;
				case 5:
					s.setAddress(mpObj.get(fieldSel));
					break;
				case 6:
					s.setPrevEducation(mpObj.get(fieldSel));
					break;
				case 7:
					s.setSubmittedFees(Double.valueOf(mpObj.get(fieldSel)));
					break;
				case 8:
					s.setTotalCourseFees(Double.valueOf(mpObj.get(fieldSel)));
					break;
				case 9:
					s.setFeeStatus(mpObj.get(fieldSel));
					break;
				case 10:
					s.setResultStatus(mpObj.get(fieldSel));
					break;
				case 11:
					s.setDurationOfCourse(Integer.valueOf(mpObj.get(fieldSel)));
					break;
				case 12:
					s.setAttendance(Integer.valueOf(mpObj.get(fieldSel)));
					break;
				case 13:
					s.setCourseYear(mpObj.get(fieldSel));
					break;
				default:
					System.out.println("No matched operation found..");
					break;
			}
		}
		
		if(mpObj==null || mpObj.isEmpty() || mpObj.keySet()==null || mpObj.keySet().isEmpty()) {
			isStudObj = false;
		}
		
		return isStudObj; 
	}

	private static void deleteStudent() throws Exception {
		Scanner it=new Scanner(System.in);
		System.out.print("Enter the particular Student Id:"); 
		String id=it.next();
		Student st=mpObj.get(id);
		boolean var=lstOne.remove(st);  
		if(var)
			System.out.println("Student is deleted");
		else
			System.out.println("Student is not  deleted");
		viewStudents(); 
//		for(Student std: lstOne) 
//		{
//			if(std.getId().equalsIgnoreCase(id)) 
//			{
//				lstOne.remove(std);  
//			}
//		}
//		System.out.println(lstOne);  
	}
	
	private static void searchStudent()
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>searchstud;   
		printSearchStudentsOptions();
		System.out.print("Enter One of the Options:");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter the admission year:");
				String courseYear=sc.next();
				searchstud = lstOne.stream().filter(std->std.getCourseYear().equals(courseYear)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else {
					for(Student s:searchstud)
						System.out.println(s); 
				}				
				break;
				
			case 2:
				System.out.print("Enter the course name:");
				String courseName=sc.next(); 
				searchstud = lstOne.stream().filter(std->std.getCourseName().equalsIgnoreCase(courseName)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {   
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);
				}				
				break;
				
			case 3:
				System.out.print("Enter the course name:");
				String courseName1=sc.next(); 
				System.out.print("Enter the course year:");
				String courseYear1=sc.next(); 
				searchstud = lstOne.stream().filter(std->{
					if(std.getCourseYear().equals(courseYear1) && std.getCourseName().equalsIgnoreCase(courseName1))
						return true;
					else
						return false;
				}).collect(Collectors.toSet());
				
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);  
				}				
				break;
				
			case 4:
				System.out.print("Enter the course name:");
				String courseName2=sc.next(); 
				System.out.print("Enter the course year:");
				String courseYear2=sc.next(); 
				System.out.print("Enter Student name:"); 
				String name=sc.next();
				searchstud = lstOne.stream().filter(std->{
					if(std.getCourseYear().equals(courseYear2) && std.getCourseName().equalsIgnoreCase(courseName2) && std.getName().equalsIgnoreCase(name))
						return true;
					else
						return false;
				}).collect(Collectors.toSet());
				
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search"); 
				}else { 
					for(Student s:searchstud)
						System.out.println(s);  
				}				
				break;
				
			case 5:
				System.out.print("Enter the course name:");
				String courseName3=sc.next(); 
				System.out.print("Enter the course year:");
				String courseYear3=sc.next(); 
				System.out.print("Enter Student email:"); 
				String email=sc.next();
				searchstud = lstOne.stream().filter(std->{ 
					if(std.getCourseYear().equals(courseYear3) && std.getCourseName().equalsIgnoreCase(courseName3) && std.getEmail().equalsIgnoreCase(email))
						return true;
					else
						return false; 
				}).collect(Collectors.toSet());
				
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);  
				}				
				break;
				
			case 6:
				System.out.print("Enter the course name:");
				String courseName4=sc.next(); 
				System.out.print("Enter the course year:");
				String courseYear4=sc.next(); 
				System.out.print("Enter Student rollno:"); 
				String rollNumber=sc.next();
				searchstud = lstOne.stream().filter(std->{
					if(std.getCourseYear().equals(courseYear4) && std.getCourseName().equalsIgnoreCase(courseName4) && std.getId().equalsIgnoreCase(rollNumber))
						return true;
					else
						return false; 
				}).collect(Collectors.toSet());
				
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);  
				}				
				break;
				
			case 7:
				System.out.print("Enter Student name:"); 
				String name1=sc.next();
				searchstud = lstOne.stream().filter(std->std.getName().equalsIgnoreCase(name1)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);   
				}				
				break; 
				
			case 8:
				System.out.print("Enter Student Email:"); 
				String email1=sc.next();
				searchstud = lstOne.stream().filter(std->std.getEmail().equalsIgnoreCase(email1)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);   
				}				
				break; 
				
			case 9:
				System.out.print("Enter Student RollNo:"); 
				String rollno1=sc.next();
				searchstud = lstOne.stream().filter(std->std.getId().equalsIgnoreCase(rollno1)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);   
				}				
				break; 
				
			default:
				System.out.println("No option provided, Please input correctly again");
				break;
		}
	} 
	
	private static void sortStudent() {
		
		Scanner st=new Scanner(System.in);
		List<Student>lst; 
		
		
		System.out.println("1.Age");
		System.out.println("2.SubmittedFees");
		System.out.println("3.ResultStatus");
		System.out.println("4.Feestatus");
		System.out.println("5.Attendance");
		
		System.out.print("Enter the Option:"); 
		int option=st.nextInt();
		switch(option)   
		{
			case 1:
				System.out.println(" Students age based to sort:");   
		
				lst = lstOne.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
				
				for(Student s:lst)
				System.out.println(s); 
				break;  
				
			case 2:
				System.out.println(" Students Submitted Fees based to sort:");   
		
				lst = lstOne.stream().sorted(Comparator.comparing(Student::getSubmittedFees)).collect(Collectors.toList());
				
				for(Student s:lst)
				System.out.println(s);  
				break;  
				
			case 3:
				System.out.println(" Students result status based to sort:");   
		
				lst = lstOne.stream().sorted(Comparator.comparing(Student::getResultStatus)).collect(Collectors.toList());
				
				for(Student s:lst)
				System.out.println(s);  
				break; 
				
			case 4:
				System.out.println(" Students Fee status based to sort:");   
		
				lst = lstOne.stream().sorted(Comparator.comparing(Student::getFeeStatus)).collect(Collectors.toList());
				
				for(Student s:lst)
				System.out.println(s);   
				break; 
				
			case 5:
				System.out.println(" Students Attendance based to sort:");    
		
				lst = lstOne.stream().sorted(Comparator.comparing(Student::getAttendance)).collect(Collectors.toList());
				
				for(Student s:lst)
				System.out.println(s);   
				break; 
				
			default:
				System.out.println("No Fields to Sort"); 
				break; 
		}
		
	}
	
	private static void pendingFees()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the Student Id/roll no:");  
		String id=sc.next();
		Student st=mpObj.get(id);
		double pendingFees=st.getTotalCourseFees()-st.getSubmittedFees();
		if(pendingFees>0)
		{
			System.out.println(st); 
			System.out.println("StudentFees pending with "+pendingFees);  	 
	    }
		else
		{
			System.out.println("StudentFees Submitted"); 
		}
	}
	
	private static void bunksInDays()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the Student Id/roll no:");  
		String id=sc.next();
		Student sd=mpObj.get(id);
		int bunks=sd.getDurationOfCourse()-sd.getAttendance();
		if(bunks>0)
		{
			System.out.println(sd);
			System.out.println("Student with bunks in days are: "+bunks);
		}	
		else
		{
			System.out.println("Student has no bunks in his academic year"); 
		}		
	}
	
	private static void studentsCount()
	{
		Scanner sc=new Scanner(System.in); 
		long count=0;
		printStudCount();
		System.out.print("Enter One of the Options:");
		int choice=sc.nextInt(); 
		switch(choice) 
		{
			case 1:
				System.out.print("Enter Student's Course name:"); 
				String name1=sc.next();
				count=lstOne.stream().filter(std->std.getCourseName().equalsIgnoreCase(name1)).count();
				if(count>0)
				{
					System.out.println("No. of Students on the year "+name1+" is: "+count);
				}
				else
				{
					System.out.println("no students are there in that year"); 
				}
				break;
				
			case 2:
				System.out.print("Enter Student's admission Year:"); 
				String year1=sc.next();
				count=lstOne.stream().filter(std->std.getCourseYear().equals(year1)).count();
				if(count>0)
				{
					System.out.println("No. of Students on the year "+year1+" is: "+count);
				}
				else
				{
					System.out.println("no students are there in that year");  
				}
				break;
				
			case 3:
				System.out.print("Enter Student's Course name:"); 
				String name2=sc.next();
				System.out.print("Enter Student's admission Year:"); 
				String year2=sc.next(); 
				count=lstOne.stream().filter(std->std.getCourseYear().equals(year2) && std.getCourseName().equalsIgnoreCase(name2)).count();
				if(count>0)
				{
					System.out.println("No. of Students on that course name and year is "+count);
				}
				else
				{
					System.out.println("no students are there in that year");  
				}
				break;
				
			default:
				System.out.println("No matches provided");
				break;
		}
	}
	
	private static void printStudCount() {
		
		System.out.println("Enter 1 to get students count on a particular course name");
		System.out.println("Enter 2 to get students count on a particular admission year");
		System.out.println("Enter 3 to get students count on both course & year ");			
	}
	
	private static void viewWithArguments()
	{
		Scanner sc=new Scanner(System.in); 
		Set<Student>searchstud;
		viewStudentsOptions();
		System.out.print("Enter One of the Options:");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter Student's Course name:"); 
				String courseName=sc.next(); 
				searchstud = lstOne.stream().filter(std->std.getCourseName().equalsIgnoreCase(courseName)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {   
					System.out.println("No Students found on the search");
				}else { 
					for(Student s:searchstud)
						System.out.println(s);
				}				
				break;
				
			case 2:
				System.out.print("Enter the admission year:");
				String courseYear=sc.next();
				searchstud = lstOne.stream().filter(std->std.getCourseYear().equals(courseYear)).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else {
					for(Student s:searchstud)
						System.out.println(s); 
				}				
				break;
				
			case 3:
				System.out.print("Enter Student's Course name:");
				String courseNameForAge = sc.next(); 
				
				System.out.print("Enter Student's Admission Year:");
				String admYearForAge = sc.next(); 
				Set<Student>searchedstudents; 
				Set<Student> stdListForAge = getStudentsByYearAndCourse(courseNameForAge,admYearForAge);
				
				if(stdListForAge!=null && !stdListForAge.isEmpty()) {
					
					System.out.print("Enter Student's age:"); 
					String stdAge = sc.next();  
					 
					searchedstudents = stdListForAge.stream().filter(std->(std.getAge()<Integer.valueOf(stdAge))).collect(Collectors.toSet());
					if(searchedstudents == null || searchedstudents.isEmpty()) {
						System.out.println("No Students found below provided age.."); 
					}else {
						System.out.println("Students found below provided age are..");
						searchedstudents.forEach(System.out::println);
					}
					
					searchedstudents = stdListForAge.stream().filter(std->(std.getAge()>Integer.valueOf(stdAge))).collect(Collectors.toSet());
					if(searchedstudents == null || searchedstudents.isEmpty()) {
						System.out.println("No Students found above provided age..");
					}else {
						System.out.println("Students found above provided age are..");
						searchedstudents.forEach(System.out::println);
					}
					
					searchedstudents = stdListForAge.stream().filter(std->(std.getAge()==Integer.valueOf(stdAge))).collect(Collectors.toSet());
					
					if(searchedstudents == null || searchedstudents.isEmpty()) {
						System.out.println("No Students found having age equal to provided age..");
					}else {
						System.out.println("Students found at provided age are..");
						searchedstudents.forEach(System.out::println);
					}
				}else {
					System.out.println("No Students found on your search criteria, Please choose other search options..");
				}				
				break;
				
			case 4:
				System.out.print("Enter Student's Course name:"); 
				String courseName2=sc.next();
				System.out.print("Enter the admission year:");
				String courseYear2=sc.next();
				System.out.print("Enter Student's Fee Status:"); 
				String feeStatus=sc.next();
				searchstud = lstOne.stream().filter(std->{
					if(std.getCourseYear().equals(courseYear2) && std.getCourseName().equalsIgnoreCase(courseName2) && std.getFeeStatus().equalsIgnoreCase(feeStatus))
						return true;
					else
						return false; 
				}).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else {
					for(Student s:searchstud)
						System.out.println(s); 
				}				
				break;
				
			case 5:
				System.out.print("Enter Student's Course name:");  
				String courseName3=sc.next();
				System.out.print("Enter the admission year:");
				String courseYear3=sc.next();
				System.out.print("Enter Student's Result Status:");
				String resultStatus=sc.next();
				searchstud = lstOne.stream().filter(std->{
					if(std.getCourseYear().equals(courseYear3) && std.getCourseName().equalsIgnoreCase(courseName3) && std.getResultStatus().equalsIgnoreCase(resultStatus))
						return true;
					else
						return false; 
				}).collect(Collectors.toSet());
				if(searchstud.isEmpty()) {  
					System.out.println("No Students found on the search");
				}else {
					for(Student s:searchstud)
						System.out.println(s);  
				}				
				break;
				
			default:
				System.out.println("No matches provided");
				break;
		} 
	}
	
	private static void viewStudentsOptions() {
		System.out.println("Enter 1  to find students on a particular course name");
		System.out.println("Enter 2 to find students those opted a particular year");
		System.out.println("Enter 3 to find students on the basis of both course, year and age");
		System.out.println("Enter 4 to find students on the basis of course, year and feestatus");
		System.out.println("Enter 5 to find a student on the basis of course, year and resultstatus");			
	} 
	
	private static void maximumFees()  
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>searchStud;
		System.out.print("Enter Student Course name:");
		String courseName=sc.next();
		System.out.print("Enter Student Admission Year:");
		String courseYear=sc.next(); 
		
		Set<Student>stList=lstOne.stream().filter(s->{
			if(s.getCourseName().equalsIgnoreCase(courseName)&&s.getCourseYear().equals(courseYear))
				return true;
			else
				return false;
		}).filter(s->s.getFeeStatus().equalsIgnoreCase("PENDING")).collect(Collectors.toSet());
		
		if(!stList.isEmpty())
		{
			double maximumFees=stList.stream().max(Comparator.comparing(Student::getSubmittedFees)).get().getSubmittedFees();
			
			searchStud=stList.stream().filter(s->s.getSubmittedFees()==maximumFees).collect(Collectors.toSet());
		
		for(Student s:searchStud)
			System.out.println(s);
		}
		else {
			System.out.println("No Students are Found"); 
		}
		
	}
	
	private static void minimumFees()
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>searchStud;
		System.out.print("Enter Student Course name:");
		String courseName=sc.next();
		System.out.print("Enter Student Admission Year:");
		String courseYear=sc.next(); 
		
		Set<Student>stList=lstOne.stream().filter(s->{
			if(s.getCourseName().equalsIgnoreCase(courseName) && s.getCourseYear().equals(courseYear))
				return true;
			else
				return false;
		}).filter(s->s.getFeeStatus().equalsIgnoreCase("PENDING")).collect(Collectors.toSet());  
		
		if(!stList.isEmpty())
		{
			double minimumFees=stList.stream().min(Comparator.comparing(Student::getSubmittedFees)).get().getSubmittedFees();
			searchStud=stList.stream().filter(s->s.getSubmittedFees()==minimumFees).collect(Collectors.toSet());
			if(searchStud.isEmpty())
				System.out.println("No students are there on your search");
			else 
				for(Student s:searchStud)
					System.out.println(s); 
		}
		else {
			System.out.println("No Students are Found");  
		}	
	}
	
	private static void mapByAttendance()
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>stList;
		Map<Student,Integer>mpOne=new HashMap<>();
		System.out.print("Enter Student's Course Name:");
		String courseName=sc.next();
		System.out.print("Enter Student's Course Year:"); 
		String courseYear=sc.next();
		
		Set<Student>stTemp=lstOne.stream().filter(s->{
			if(s.getCourseName().equalsIgnoreCase(courseName) && s.getCourseYear().equals(courseYear))
				return true;
			else
				return false;
		}).collect(Collectors.toSet());
		
		if(!stTemp.isEmpty())
		{
			for(Student st:stTemp)
				mpOne.put(st, st.getAttendance());
		
		System.out.println(" Sort by Attendance Before Sort:");
		mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getValue()));
		System.out.println("1.Sort Attendance in Ascending Order");
		System.out.println("1.Sort Attendance in Descending Order");
		System.out.print("Enter the Option:"); 
		int k=sc.nextInt();
		switch(k) 
		{
			case 1:
		            mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		            System.out.println(" Sort by Attendance After Sort:");
		            mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getValue()));
		            break;
			case 2:
					mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		            System.out.println(" Sort by Attendance After Sort:");
		            mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getValue()));
		            break;
		            
		    default:
		    	System.out.println("No student data found"); 
		    	break;
		}
	   }   
		else
		{
			System.out.println("No Students Found");  
		}
	}
	
	private static void mapBySubmittedFees()
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>stList;
		Map<Student,Double>mpOne=new HashMap<>(); 
		System.out.print("Enter Student's Course Name:");
		String courseName=sc.next();
		System.out.print("Enter Student's Course Year:"); 
		String courseYear=sc.next();
		
		Set<Student>stTemp=lstOne.stream().filter(s->{
			if(s.getCourseName().equalsIgnoreCase(courseName) && s.getCourseYear().equals(courseYear))
				return true;
			else
				return false;
		}).collect(Collectors.toSet());
		
		if(!stTemp.isEmpty())
		{
			for(Student st:stTemp)
				mpOne.put(st, st.getSubmittedFees());
		
		System.out.println(" Sort by Submitted Fees Before Sort:");
		mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Submitted Fees: " +std.getValue()));
		mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		System.out.println(" Sort by Submitted Fees After Sort:"); 
		mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Submitted Fees: "+std.getValue()));
		}
		else
		{
			System.out.println("No Students Found");  
		}
	}
	
	private static void mapByUpdateSubmittedFees() 
	{
		Scanner sc=new Scanner(System.in);
		Set<Student>stList;
		Map<Student,Double>mpOne=new HashMap<>(); 
		System.out.print("Enter Student's Course Name:");
		String courseName=sc.next();
		System.out.print("Enter Student's Course Year:"); 
		String courseYear=sc.next();
		
		Set<Student>stTemp=lstOne.stream().filter(s->{
			if(s.getCourseName().equalsIgnoreCase(courseName) && s.getCourseYear().equals(courseYear))
				return true;
			else
				return false;
		}).collect(Collectors.toSet());
		
		if(!stTemp.isEmpty())
		{
			for(Student st:stTemp)
				mpOne.put(st, st.getSubmittedFees()); 
		
		System.out.println(" Sort by Submitted Fees Before Sort:");  
		mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getKey().getAttendance()+" Submitted Fees: "+std.getValue()));
		Comparator<Student> bySubFees = (Student o1, Student o2)-> Double.valueOf(o1.getSubmittedFees()).compareTo(Double.valueOf(o2.getSubmittedFees()));
		mpOne=mpOne.entrySet().stream().sorted(Map.Entry.comparingByKey(bySubFees)).collect(Collectors.toMap(t->t.getKey(), t->t.getValue(), (oldVal,newVal)->oldVal,LinkedHashMap::new));
		System.out.println(" Sort by Submitted Fees After Sort:");  
		mpOne.entrySet().forEach(std->System.out.println(std.getKey().getId()+":"+std.getKey().getName()+" Attendance: "+std.getKey().getAttendance()+" Submitted Fees: "+std.getValue()));
		}
		else
		{
			System.out.println("No Students Found");   
		} 
	}
	
	private static void verifyStudentObjIdentityThroughMap() {  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student's Course Name:");
		String courseName = sc.next();
		System.out.print("Enter Student's Admission Year:"); 
		String courseYear = sc.next(); 
		Set<Student> studList = getStudentsByYearAndCourse(courseName,courseYear); 
		Map<Student, Student> mp = new HashMap<>();
		
		if(!studList.isEmpty()) {
			for(Student s:studList) {
				mp.put(s, s);
			}
			studList.forEach(System.out::println); 
			Student sObjOne = viewIndividualStudent(); 
			Student sOrg = mp.get(sObjOne);
			System.out.println("Original Student object from map before updation: "+sOrg);
			
			sObjOne.setSubmittedFees(10000);
			mp.put(sObjOne, sObjOne);			
			
			Student sUpd = mp.get(sObjOne);
			System.out.println("Student object from map after updation: "+sUpd);
			System.out.println("sOrg==sUpd: "+(sOrg==sUpd));
			System.out.println("Original Student object from map after updation: "+sOrg);
			System.out.println("sObjOne==sOrg: "+(sObjOne==sOrg));
			System.out.println("sObjOne==sUpd: "+(sObjOne==sUpd));
		}
	}
	

	private static void custViewOfStudentsByYearAndCourse() {
		if(lstOne==null || lstOne.isEmpty()) {
			System.out.println("Student data store is empty");
			return;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Course Name:");
		String courseName = sc.next(); 
		
		System.out.println("Enter Student's admission Year:");
		String courseYear = sc.next();
		Set<Student> studList = getStudentsByYearAndCourse(courseName, courseYear);
		
		if(studList!=null && !studList.isEmpty()) {
		
			List<String> lstCustInfo = studList.stream().map(s-> "Roll: "+s.getRollNumber()+", Address: "+s.getAddress()
			+", Course: "+s.getCourseName()+", Admission Year: "+s.getCourseYear()).collect(Collectors.toList()); 
			
			lstCustInfo.forEach(System.out::println);
			
		}else {
			System.out.println("No Students found on your search criteria, Please choose other search options..");
		}
	}
	
	private static Set<Student> getStudentsByYearAndCourse(String courseName, String courseYear){
		Set<Student> studListTemp = lstOne.stream().filter(std->{
			if(std.getCourseYear().equals(courseYear) && std.getCourseName().equalsIgnoreCase(courseName))
				return true;
			else
				return false;
		}).collect(Collectors.toSet());
		
		return studListTemp;  
	}
	
	private static void printSearchStudentsOptions() { 
	
		System.out.println("Enter 1  to find students those admitted on a particular year");
		System.out.println("Enter 2 to find students those opted a particular course");
		System.out.println("Enter 3 to find students on the basis of both course & year ");
		System.out.println("Enter 4 to find students on the basis of course, year & name");
		System.out.println("Enter 5 to find a student on the basis of course, year & email");
		System.out.println("Enter 6 to find a student on the basis of course, year & roll no");
		System.out.println("Enter 7 to find a student on the basis of only name");
		System.out.println("Enter 8 to find a student on the basis of only email");	
		System.out.println("Enter 9 to find a student on the basis of only roll no");
				
	}
	
	private static void printStudFieldSelInstructions() {

		System.out.println("Please select below options to update fields");
		System.out.println("Enter 1 to input name");
		System.out.println("Enter 2 to input age");
		System.out.println("Enter 3 to input email");
		System.out.println("Enter 4 to input course name");
		System.out.println("Enter 5 to input address");
		System.out.println("Enter 6 to input prev education");
		System.out.println("Enter 7 to input submitted fees");
		System.out.println("Enter 8 to input total course fees");
		System.out.println("Enter 9 to input course fee status");
		System.out.println("Enter 10 to input result status");
		System.out.println("Enter 11 to input course duration");
		System.out.println("Enter 12 to input attendance");
		System.out.println("Enter 13 to input admission year"); 

		}

	public static void print() 
	{
		System.out.println("Enter 1 for View List of all Students");
		System.out.println("Enter 2 for List of Students filtering with arguments against a particular course and year");
		System.out.println("Enter 3 for View individual Student details by passing student id or rollno.");
		System.out.println("Enter 4 for Show list of Students only having rollno, address, course name, year by transforming every Student details in the original list against course name and year");
		System.out.println("Enter 5 for add a new Student");
		System.out.println("Enter 6 for Update a Particular Student Details");
		System.out.println("Enter 7 for Delete a Particular Student Details"); 
		System.out.println("Enter 8 for Search a Student");
		System.out.println("Enter 9 for Sort Students list");
		System.out.println("Enter 10 for Show pending fees of any Student");
		System.out.println("Enter 11 for Total bunks of a Particular Student");
		System.out.println("Enter 12 for Students whose fee status is PENDING and submitted Maximum fee");
		System.out.println("Enter 13 for Students whose fee status is PENDING and submitted Minimum fee");
		System.out.println("Enter 14 for total Student count against a course name and year");
		System.out.println("Enter 15 for View List of Students by Map and Sort based on Attendance");
		System.out.println("Enter 16 for View List of Students byMap and Sort based on Submitted Fees");
		System.out.println("Enter 17 for Updating Student's Submitted Fees by Map and Sort by SubmittedFees");
		System.out.println("Enter quit and hit enter key to exit");
	}
	
}