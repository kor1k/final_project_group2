package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {

}
