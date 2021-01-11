package com.xworkz.college.tester;



import com.xworkz.college.dao.CollegeDAO;
import com.xworkz.college.dao.CollegeDAOimpl;
import com.xworkz.college.dto.CollegeDTO;

public class Tester{

	public static void main(String[] args) {
		
		CollegeDTO collegeDTO = new CollegeDTO();
		collegeDTO.setCname("TJIT");
		collegeDTO.setLocation("BANGALORE");
		collegeDTO.setNoOfBranches(10);
		CollegeDAO collegeDaoImpl =new CollegeDAOimpl();
		
		collegeDaoImpl.saveCollege(collegeDTO);
		//collegeDaoImpl.fetchCollege(2);
		//collegeDaoImpl.updateCollege(collegeDTO,2);
		
	}
}
