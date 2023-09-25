package playwithjava.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import playwithjava.in.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    @Query(value = "select * from employee where name=:nameValue",nativeQuery = true)
    List<EmployeeEntity> findUsersByName(String nameValue);
}
