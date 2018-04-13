package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/config.xml");
		Employee emp=(Employee)ctx.getBean("empObj");
	   System.out.println(emp);
	
	}

}
