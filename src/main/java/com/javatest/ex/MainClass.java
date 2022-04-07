package com.javatest.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// ctx 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml"); // 컨테이너 설정
		ctx.refresh(); // 컨테이너 설정
		
		Student student = ctx.getBean("student",Student.class); // 컨테이너 사용
		System.out.println(student.getName());
		
		ctx.close();
	}

}
