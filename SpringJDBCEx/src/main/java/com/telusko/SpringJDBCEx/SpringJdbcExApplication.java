package com.telusko.SpringJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student std1 = context.getBean(Student.class);
//		std1.setRollNo(104);
//		std1.setName("Navin");
//		std1.setMarks(78);

		StudentService service = context.getBean(StudentService.class);
//		service.addStudent(std1);

		List<Student> students = service.getAllStudents();
		System.out.println(students);
	}

}
