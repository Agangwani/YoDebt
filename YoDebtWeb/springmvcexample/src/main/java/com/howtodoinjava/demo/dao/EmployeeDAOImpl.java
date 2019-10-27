package com.howtodoinjava.demo.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeVO;

import com.howtodoinjava.demo.company.Mortgage;
import static com.howtodoinjava.demo.company.Mortgage.*;

@Repository
public class EmployeeDAOImpl{

	/**
	 * The classes at third tier in 3-tier architecture. Responsible for interacting with underlying DB storage.
	 *
	 * @return
	 */

	/*public List<EmployeeVO> getAllEmployees()
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		employees.add(vo2);
		
		return employees;
	}
*/



	public static ArrayList<ArrayList<Float>> getInformation(){
		float loanAmount = 100000; // replace with database information
		double interestRate = 0.05;
		float term = 120;
		Mortgage mortgage = new Mortgage(loanAmount, (float)interestRate, term);
		String schoolRank = "top50"; // replace with databse information
		String major = "stem";
		String schoolLocation = "ne";

		String[] underwrite = {schoolRank,schoolLocation, major};
		ArrayList<ArrayList<Float>> mortgageValues = showValues(mortgage, underwrite);

		ArrayList<Float> months = mortgageValues.get(0);
		ArrayList<Float> updatedLoan = mortgageValues.get(1);
		ArrayList<Float> monthlyPayments = mortgageValues.get(5);

		ArrayList<ArrayList<Float>> finalValue = new ArrayList<>();
		finalValue.add(months);
		finalValue.add(updatedLoan);
		finalValue.add(monthlyPayments);


		return finalValue;



		/**
		 *
		 *  String schoolRank = "top50";
		 *         String schoolLocation = "ne";
		 *         String major = "stem";
		 *         float loanAmount = 100000;
		 *         double couponValue = 0.05;
		 *         float termmonths = 120;
		 *         String[] underwrite = {schoolRank, schoolLocation, major}; // for student loans analysis only
		 *         Mortgage mortgage = new Mortgage(loanAmount, (float)couponValue, termmonths);
		 *
		 *         ArrayList<ArrayList<Float>> mortgageValues = showValues(mortgage, underwrite);
		 *         ArrayList<Float> months = mortgageValues.get(0);
		 *         ArrayList<Float> updatedLoan = mortgageValues.get(1);
		 *         ArrayList<Float> TotalCash = mortgageValues.get(2);
		 *         ArrayList<Float> Principle = mortgageValues.get(3);
		 *         ArrayList<Float> Interest = mortgageValues.get(4);
		 */
	}
}