package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Employer;

@Repository
public interface EmployerRepo extends JpaRepository<Employer, Long> {

}
