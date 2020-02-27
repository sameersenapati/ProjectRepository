package in.nit.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import in.nit.repository.StudentRepository;
@Component
public class JpaTestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.findAll(PageRequest.of(0, 3)).forEach(System.out::println);

	}

}
