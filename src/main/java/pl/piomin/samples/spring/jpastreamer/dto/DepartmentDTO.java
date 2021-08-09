package pl.piomin.samples.spring.jpastreamer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.piomin.samples.spring.jpastreamer.model.Department;

@Data
@AllArgsConstructor
public class DepartmentDTO {
    Integer id; 
    String name;

    public DepartmentDTO(Department department) {
        this(department.getId(), department.getName());
    }
}