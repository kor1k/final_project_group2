package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Experience;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Long> {

}
