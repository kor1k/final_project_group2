package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entity.Education;

@Repository
public interface EducationRepo extends JpaRepository<Education, Long> {

}
