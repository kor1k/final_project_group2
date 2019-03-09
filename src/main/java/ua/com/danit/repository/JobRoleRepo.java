package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.JobRole;

@Repository
public interface JobRoleRepo extends JpaRepository<JobRole, Long> {

}
