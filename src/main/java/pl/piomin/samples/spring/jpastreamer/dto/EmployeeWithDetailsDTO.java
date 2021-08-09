package pl.piomin.samples.spring.jpastreamer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.piomin.samples.spring.jpastreamer.model.Employee;

// public record EmployeeWithDetailsDTO(
//         Integer id,
//         String name,
//         String position,
//         int salary,
//         String organizationName,
//         String departmentName
// ) {
//     public EmployeeWithDetailsDTO(Employee emp) {
//         this(emp.getId(), emp.getName(), emp.getPosition(), emp.getSalary(),
//                 emp.getOrganization().getName(),
//                 emp.getDepartment().getName());
//     }
// }

@Data
@AllArgsConstructor
public class EmployeeWithDetailsDTO {
        Integer id;
        String name;
        String position;
        int salary;
        String organizationName;
        String departmentName;

    public EmployeeWithDetailsDTO(Employee emp) {
        this(emp.getId(), emp.getName(), emp.getPosition(), emp.getSalary(),
                emp.getOrganization().getName(),
                emp.getDepartment().getName());
    }
}