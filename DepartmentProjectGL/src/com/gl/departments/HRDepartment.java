package com.gl.departments;

public class HRDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "HR Department";
	}
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "Team Lunch";
	}
}
