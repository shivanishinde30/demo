package com.training.beans;

import java.util.Date;

public class Employee {

	private int empno;
	private String leaveType;
	private String Reason;
	private Date startDate;
	private Date endDate;
	
	public Employee() {
		super();
	}

	public Employee(int empno, String leaveType, String reason, Date startDate, Date endDate) {
		super();
		this.empno = empno;
		this.leaveType = leaveType;
		Reason = reason;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", leaveType=" + leaveType + ", Reason=" + Reason + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
