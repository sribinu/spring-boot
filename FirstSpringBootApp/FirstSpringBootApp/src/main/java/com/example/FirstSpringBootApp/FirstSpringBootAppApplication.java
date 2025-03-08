package com.example.FirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootAppApplication.class,args);
		Student student = context.getBean(Student.class);
		student.writeExam();

//		ApplicationContext context = SpringApplication.run(FirstSpringBootAppApplication.class, args);
//		Student student= context.getBean(Student.class);
//		student.show();
//		student.age=21;
//		System.out.println(student.age);
//
//		Student student1 = context.getBean(Student.class);
//		student1.show();
//		System.out.println(student1.age);
	}

}
