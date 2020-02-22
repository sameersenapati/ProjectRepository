package in.nit.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Employee {
   private Integer empId;
   private String empName;
   private Double empSal;
}
