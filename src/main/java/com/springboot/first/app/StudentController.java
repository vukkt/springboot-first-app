package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh", "Fadatare");
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh", "Fadatare"));
		students.add(new Student("Tony", "Cena"));
		students.add(new Student("Sanjay", "Jadhav"));
		students.add(new Student("Ram", "Jadhav"));
		students.add(new Student("Umesh", "Fadatare"));
		return students;
	}

	// http://localhost:8080/student/ramesh/fadatare
	/// @Pathvariable annotation

	@GetMapping("student/{firstName}/{lastName}") // URI template variable
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
