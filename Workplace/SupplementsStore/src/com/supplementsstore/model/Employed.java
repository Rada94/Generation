package com.supplementsstore.model;

public class Employed {
	private String employedType;
	private double salesMonthEmployed;
	private int overtimeEmployed;
	
	public Employed()
	{
		
	}
	
	public Employed(String employedType, double salesMonthEmployed, int overtimeEmployed)
	{
		this.employedType=employedType;
		this.salesMonthEmployed=salesMonthEmployed;
		this.overtimeEmployed=overtimeEmployed;
	}
	
	public double calculateNetSalary(String employedType, double salesMonthEmployed, int overtimeEmployed)
	{
		double netSalary=0.0;
		double salary=0.0;
		double bonus=0.0;
		double rodeOvertime=0.0;
		final double SALARY_EMPLOYED_VENDOR=1000;
		final double SALARY_EMPLOYED_BOSS=1500;
		final double OVERTIME_PRICE=20;
		
		
		if(employedType.equals("vendor"))
		{
			salary=SALARY_EMPLOYED_VENDOR;
		}
		else
		{
			if(employedType.equals("boss"))
			{
				salary=SALARY_EMPLOYED_BOSS;
			}
		}
		
		if(salesMonthEmployed>=1000 && salesMonthEmployed<1500)
		{
			bonus=100;
		}
		else
		{
			if(salesMonthEmployed>=1500)
			{
				bonus=200;
			}
		}
		
		rodeOvertime=overtimeEmployed*OVERTIME_PRICE;
		
		netSalary=salary+rodeOvertime+bonus;
		
		return netSalary;
	}
	
	public String getEmployedType()
	{
		return employedType;
	}
	
	public void setEmployedType(String employedType)
	{
		this.employedType=employedType;
	}

	public double getSalesMonthEmployed()
	{
		return salesMonthEmployed;
	}
	
	public void setSalesMonthEmployed(double salesMonthEmployed)
	{
		this.salesMonthEmployed=salesMonthEmployed;
	}

	public int getOvertimeEmployed()
	{
		return overtimeEmployed;
	}
	
	public void setOvertimeEmployed(int overtimeEmployed)
	{
		this.overtimeEmployed=overtimeEmployed;
	}
}
