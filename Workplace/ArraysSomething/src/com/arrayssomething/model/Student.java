package com.arrayssomething.model;

public class Student {
	private String name;
	private int age;
	private double score;
	
	public Student()
	{
		this.name="";
		this.age=0;
		this.score=0.0;
	}
	
	public Student(String _name, int age, double score)
	{
		name=_name;
		this.age=age;
		this.score=score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public void setScore(double score)
	{
		this.score=score;
	}
}
