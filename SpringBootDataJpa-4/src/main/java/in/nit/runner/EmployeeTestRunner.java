package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.getAllEmpNames().forEach(System.out::println);
		repo.getEmpNames().forEach(System.out::println);
		repo.getAllIdNames().forEach(System.out::println);
	}
}
