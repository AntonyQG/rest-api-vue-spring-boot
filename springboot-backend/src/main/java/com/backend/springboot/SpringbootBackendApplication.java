package com.backend.springboot;

import com.backend.springboot.entity.Employee;
import com.backend.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Antony")
				.lastName("Quintero")
				.email("antonyquinterog@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Jorge")
				.lastName("Garcia")
				.email("jorgeg@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Fernanda")
				.lastName("Eugenio")
				.email("fer_soto_eug@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
