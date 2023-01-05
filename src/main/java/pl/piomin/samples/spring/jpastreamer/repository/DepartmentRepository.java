package pl.piomin.samples.spring.jpastreamer.repository;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.stereotype.Repository;
import pl.piomin.samples.spring.jpastreamer.dto.DepartmentDTO;
import pl.piomin.samples.spring.jpastreamer.dto.EmployeeDTO;
import pl.piomin.samples.spring.jpastreamer.model.Department;
import pl.piomin.samples.spring.jpastreamer.model.Department$;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class DepartmentRepository {

    private final JPAStreamer streamer;

    public DepartmentRepository(JPAStreamer streamer) {
        this.streamer = streamer;
    }

    public List<DepartmentDTO> findAll() {
        return streamer.stream(Department.class)
                .sorted(Department$.name)
                .map(DepartmentDTO::new)
                .collect(Collectors.toList());
    }

    public long getNumberOfEmployees(Integer id) {
        return streamer.stream(Department.class)
                .filter(Department$.id.equal(id))
                .map(Department::getEmployees)
                .mapToLong(Set::size)
                .sum();
    }

    public List<EmployeeDTO> getEmployees(Integer id) {
        return streamer.stream(Department.class)
                .filter(Department$.id.equal(id))
                .map(Department::getEmployees)
                .flatMap(Set::stream)
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }

}
