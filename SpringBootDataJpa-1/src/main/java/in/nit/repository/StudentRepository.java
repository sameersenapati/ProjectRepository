package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
