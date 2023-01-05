package pl.piomin.samples.spring.jpastreamer.repository;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.stereotype.Repository;
import pl.piomin.samples.spring.jpastreamer.dto.EmployeeDTO;
import pl.piomin.samples.spring.jpastreamer.dto.EmployeeWithDetailsDTO;
import pl.piomin.samples.spring.jpastreamer.model.Employee;
import pl.piomin.samples.spring.jpastreamer.model.Employee$;

import java.util.List;
import java.util.stream.Collectors;

import static com.speedment.jpastreamer.streamconfiguration.StreamConfiguration.of;

@Repository
public class EmployeeRepository {

    private final JPAStreamer streamer;

    public EmployeeRepository(JPAStreamer streamer) {
        this.streamer = streamer;
    }

    public List<EmployeeDTO> findBySalaryGreaterThan(final int salary) {
        return streamer.stream(Employee.class)
                .filter(Employee$.salary.greaterThan(salary))
                .sorted(Employee$.salary)
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }

    public List<EmployeeDTO> findAllWithPagination(final int offset,
                                                   final int limit) {
        return streamer.stream(Employee.class)
                .skip(offset)
                .limit(limit)
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }

    public EmployeeWithDetailsDTO findById(final Integer id) {
        return streamer.stream(of(Employee.class)
                        .joining(Employee$.department)
                        .joining(Employee$.organization))
                .filter(Employee$.id.equal(id))
                .map(EmployeeWithDetailsDTO::new)
                .findFirst()
                .orElseThrow();
    }
}
