package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Talent;

@Repository
public interface TalentRepo extends JpaRepository<Talent,Long> {

}
