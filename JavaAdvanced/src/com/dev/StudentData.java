package com.dev;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class StudentData {
	
	public static Set<Student> populateStudentsInfo(String objFormStrategy) throws Exception {
		Set<Student>lst=new HashSet<>(); 
		
		if(objFormStrategy.equalsIgnoreCase(SmsConstants.STUD_INSTANCES_DYNAMIC)) {	
			Student s=new Student();
			String studentId=UUID.randomUUID().toString();
			s.setId(studentId); 
			s.setRollNumber(s.getId()); 
			s.setName("Sunil");
			s.setAge(20); 
			s.setEmail("sunil@gmail.com"); 
			s.setCourseName("Java"); 
			s.setAddress("Ongole"); 
			s.setSubmittedFees(150000);    
			s.setPrevEducation("CSE"); 
			s.setResultStatus(ResultStatus.CONTINUEING.name());  
			s.setAttendance(300); 
			s.setTotalCourseFees(200000); 
			s.setDurationOfCourse(365); 
		    s.setFeeStatus(CourseFeeStatus.PENDING.name()); 
		    s.setCourseYear("2019");    
	
		    Student s1=new Student();
		    String studentID=UUID.randomUUID().toString();
		    s1.setId(studentID);  
		    s1.setRollNumber(s1.getId());  
		    s1.setName("Peter");
		    s1.setAge(27); 
		    s1.setEmail("peter@gmail.com"); 
		    s1.setCourseName("Java");  
		    s1.setAddress("Bangalore"); 
		    s1.setSubmittedFees(180000);   
		    s1.setPrevEducation("EEE"); 
		    s1.setResultStatus(ResultStatus.CONTINUEING.name()); 
		    s1.setAttendance(60); 
		    s1.setTotalCourseFees(200000); 
		    s1.setDurationOfCourse(365); 
		    s1.setFeeStatus(CourseFeeStatus.PENDING.name());   
		    s1.setCourseYear("2019");
		    
		    Student s2=new Student();
		    String studId=UUID.randomUUID().toString();
		    s2.setId(studId);  
		    s2.setRollNumber(s2.getId());  
		    s2.setName("James");
		    s2.setAge(21); 
		    s2.setEmail("james@gmail.com"); 
		    s2.setCourseName("Python"); 
		    s2.setAddress("America"); 
		    s2.setSubmittedFees(380000);   
		    s2.setPrevEducation("MECH"); 
		    s2.setResultStatus(ResultStatus.CONTINUEING.name()); 
		    s2.setAttendance(300); 
		    s2.setTotalCourseFees(400000); 
		    s2.setDurationOfCourse(365); 
		    s2.setFeeStatus(CourseFeeStatus.PENDING.name());  
		    s2.setCourseYear("2016");
		    
		    Student s3=new Student();
		    String stuId=UUID.randomUUID().toString();
		    s3.setId(stuId);   
		    s3.setRollNumber(s3.getId());  
		    s3.setName("John");
		    s3.setAge(24);  
		    s3.setEmail("john@gmail.com"); 
		    s3.setCourseName("Python"); 
		    s3.setAddress("chennai"); 
		    s3.setSubmittedFees(280000);   
		    s3.setPrevEducation("CIVIL"); 
		    s3.setResultStatus(ResultStatus.CONTINUEING.name()); 
		    s3.setAttendance(310); 
		    s3.setTotalCourseFees(300000); 
		    s3.setDurationOfCourse(365); 
		    s3.setFeeStatus(CourseFeeStatus.PENDING.name());  
		    s3.setCourseYear("2016");
		    
		    Student s4=new Student();
		    String stId=UUID.randomUUID().toString();
		    s4.setId(stId);   
		    s4.setRollNumber(s4.getId());  
		    s4.setName("Alex");
		    s4.setAge(23); 
		    s4.setEmail("alex@gmail.com"); 
		    s4.setCourseName("CyberSecurity"); 
		    s4.setAddress("Hyderabad"); 
		    s4.setSubmittedFees(280000);   
		    s4.setPrevEducation("IT"); 
		    s4.setResultStatus(ResultStatus.CONTINUEING.name()); 
		    s4.setAttendance(340); 
		    s4.setTotalCourseFees(300000); 
		    s4.setDurationOfCourse(365); 
		    s4.setFeeStatus(CourseFeeStatus.PENDING.name());    
		    s4.setCourseYear("2015");  
		    
		    lst.add(s);
		    lst.add(s1); 
		    lst.add(s2); 
		    lst.add(s3);
		    lst.add(s4);
		    
	    }else {
			throw new Exception("Please give permission to set students information..");
		}
	    return lst;

	}
	
}
