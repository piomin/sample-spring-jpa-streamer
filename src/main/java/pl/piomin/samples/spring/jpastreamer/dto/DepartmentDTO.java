package pl.piomin.samples.spring.jpastreamer.dto;

import pl.piomin.samples.spring.jpastreamer.model.Department;

public record DepartmentDTO(Integer id, String name) {
    public DepartmentDTO(Department department) {
        this(department.getId(), department.getName());
    }
}
