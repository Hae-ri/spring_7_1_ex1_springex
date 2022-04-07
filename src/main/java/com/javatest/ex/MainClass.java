package com.javatest.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// ctx �����̳� ����
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml"); // �����̳� ����
		ctx.refresh(); // �����̳� ����
		
		Student student = ctx.getBean("student",Student.class); // �����̳� ���
		System.out.println(student.getName());
		
		ctx.close();
	}

}
