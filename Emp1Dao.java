package com.deloitte.empl.dao;
import java.util.List;

import com.deloitte.empl.beans.Emp;

public interface Emp1Dao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	void delEmp(int empcode);
	void updaterow(double sal,int empcode);
	int updateEmp(Emp emp);
}
