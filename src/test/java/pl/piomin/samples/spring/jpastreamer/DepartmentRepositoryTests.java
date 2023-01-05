package pl.piomin.samples.spring.jpastreamer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.piomin.samples.spring.jpastreamer.dto.DepartmentDTO;
import pl.piomin.samples.spring.jpastreamer.dto.EmployeeDTO;
import pl.piomin.samples.spring.jpastreamer.repository.DepartmentRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DepartmentRepositoryTests {

    @Autowired
    private DepartmentRepository repository;

    @Test
    void findAll() {
        List<DepartmentDTO> all = repository.findAll();
        assertEquals(4, all.size());
    }

    @Test
    void getNumberOfEmployeesByDepartment() {
        long count = repository.getNumberOfEmployees(1);
        assertEquals(3, count);
    }

    @Test
    void getEmployeesByDepartment() {
        List<EmployeeDTO> employees = repository.getEmployees(1);
        assertEquals(3, employees.size());
    }
}
