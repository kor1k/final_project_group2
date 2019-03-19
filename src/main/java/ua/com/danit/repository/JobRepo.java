package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entity.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {
}
