package com.supplementsstore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployedTest {

	@Test
	void testCalculateNetSalary() {
		Employed myEmployed=new Employed();
		double netSalaryReal=0.0, netSalaryExpected=0.0;
		
		netSalaryExpected=1140;
		netSalaryReal=myEmployed.calculateNetSalary("vendor", 1000, 2);
		
		assertEquals(netSalaryExpected, netSalaryReal);
	}

}
