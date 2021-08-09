package pl.piomin.samples.spring.jpastreamer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.piomin.samples.spring.jpastreamer.model.Employee;

@Data
@AllArgsConstructor
public class EmployeeDTO {
        Integer id;
        String name;
        String position;
        int salary;


        public EmployeeDTO(Employee emp) {
            this(emp.getId(), emp.getName(), emp.getPosition(), emp.getSalary());
        }
}