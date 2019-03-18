package ua.com.danit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entity.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {
}
