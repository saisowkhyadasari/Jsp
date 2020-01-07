package com.deloitte.empl.utils;

public class EmpUtilsA {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static final String DELROW="delete from emp where empno=?";
	public static final String UPDATEROW="update emp set sal=? where empno=?";
	public static final String UPDATEEMP="update emp set ename=?,job=? where empno=?";
}
