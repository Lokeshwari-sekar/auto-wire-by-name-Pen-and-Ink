package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cob=new ClassPathXmlApplicationContext("spring.xml");
		 PenClass pob=(PenClass) cob.getBean("penob");
		 pob.penWorking();

	}

}
