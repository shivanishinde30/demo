package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.sql.Template;
import org.springframework.jdbc.core.RowMapper;

import com.training.beans.Employee;

public class EmpDao {

	public List<Employee> getEmployees() {
		
		return  Template.query("select * from Employee",new RowMapper<Employee>(){    
		        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
		        	Employee e=new Employee();    
		            e.setEmpno(rs.getInt(1));    
		            e.setLeaveType(rs.getString(2));    
		            e.setReason(rs.getString(3));    
		            e.setStartDate(rs.getDate(4));  
		            e.setEndDate(rs.getDate(5));
		            return e;    
		        }    
		    });    
	}

}
