package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language, Long> {

}
