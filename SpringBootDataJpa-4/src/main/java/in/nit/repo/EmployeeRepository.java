package in.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query("select e from Employee e")
	List<Employee> getAllEmpNames();
	@Query("select e.empName from Employee e")
	List<String> getEmpNames();
	@Query("select e.empId,e.empName from Employee e")
	List<Object[]> getAllIdNames();

}
