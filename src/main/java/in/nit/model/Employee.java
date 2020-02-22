package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="emp")
public class Employee {
	@Id
	@Column
	private Integer empId;
	@Column
	private String empName;
	@Column
	private Double empSal;
}
